package main.java.by.itacademy.array.arraymain;


import main.java.by.itacademy.array.entity.ArrayObject;
import main.java.by.itacademy.array.reader.ReaderArray;
import main.java.by.itacademy.array.reader.impl.ReaderArrayImpl;
import main.java.by.itacademy.array.repository.ArrayRepository;
import main.java.by.itacademy.array.service.ArrayService;
import main.java.by.itacademy.array.service.impl.ArrayServiceImpl;
import main.java.by.itacademy.oop.exception.CustomException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ArrayMain {
    public static void main(String[] args) throws CustomException {
        ReaderArray readerArray =  new ReaderArrayImpl();
        ArrayService arrayService = new ArrayServiceImpl();
        List<ArrayObject> listArrays = readerArray.readArray("res\\arraydata.txt");
        ArrayRepository repository = new ArrayRepository(listArrays);
    }
}

