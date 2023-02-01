package main.java.by.itacademy.array.arraymain;


import main.java.by.itacademy.array.entity.ArrayObject;
import main.java.by.itacademy.array.reader.ReaderArray;
import main.java.by.itacademy.array.reader.readerarrayimpl.ReaderArrayImpl;
import main.java.by.itacademy.array.service.ArrayService;
import main.java.by.itacademy.array.service.impl.ArrayServiceImpl;
import main.java.by.itacademy.oop.exception.CustomException;
import main.java.by.itacademy.oop.reader.ReaderFile;
import main.java.by.itacademy.oop.reader.impl.ReaderFileImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ArrayMain {
    public static void main(String[] args) throws CustomException {
        ReaderArray readerArray =  new ReaderArrayImpl();
        File file = new File("res\\arraydata.txt");
        readerArray.readArray(file);

    }
}

