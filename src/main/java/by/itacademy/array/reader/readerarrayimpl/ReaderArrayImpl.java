package main.java.by.itacademy.array.reader.readerarrayimpl;

import main.java.by.itacademy.array.validator.NumberValidator;
import main.java.by.itacademy.array.validator.impl.NumberValidatorImpl;
import main.java.by.itacademy.oop.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderArrayImpl {
    public int [][] readFile(File file) throws CustomException {
        NumberValidator numberValidator = new NumberValidatorImpl();
        List<String> list = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String str;
            while ((str = reader.readLine()) != null) {
                if(numberValidator.numberValidate(str)){
                //int[] name = Integer.parseInt(str);
                for (String s : strings) {
                    list.add(s);
                }}
            }
        } catch (IOException e) {
            throw new CustomException(e);
        }
        return ;
    }
}
