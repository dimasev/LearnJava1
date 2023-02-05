package main.java.by.itacademy.array.reader.impl;

import main.java.by.itacademy.array.creator.CreatorArray;
import main.java.by.itacademy.array.creator.impl.CreatorArrayImpl;
import main.java.by.itacademy.array.entity.ArrayObject;
import main.java.by.itacademy.array.reader.ReaderArray;
import main.java.by.itacademy.array.repository.ArrayRepository;
import main.java.by.itacademy.array.validator.NumberValidator;
import main.java.by.itacademy.array.validator.impl.NumberValidatorImpl;
import main.java.by.itacademy.oop.exception.CustomException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderArrayImpl implements ReaderArray {
    static final  String STR_REGEX = "\\s+";
    public List<ArrayObject> readArray(String nameFile) throws CustomException {
        NumberValidator numberValidator = new NumberValidatorImpl();
        CreatorArray creatorArray = new CreatorArrayImpl();
        List<Integer> list = new ArrayList();
        List<ArrayObject> listArrays= new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))){
            String str;
            while ((str = reader.readLine()) != null) {
                String[] strings = str.split(STR_REGEX);
                for(String s:strings){
                if(numberValidator.numberValidate(s)){
                    list.add(Integer.parseInt(s));}
                }
                int[] array = new int[list.size()];
                    for (int i = 0;i<list.size();i++) {
                    array[i] = list.get(i);}
                    listArrays.add(creatorArray.creatorArray((array)));
                }
            }
         catch (IOException e) {
            throw new CustomException(e);
        }
        return  listArrays;
    }
}
