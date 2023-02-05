package main.java.by.itacademy.array.reader;

import main.java.by.itacademy.array.entity.ArrayObject;
import main.java.by.itacademy.oop.exception.CustomException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface ReaderArray {
    List<ArrayObject> readArray(String nameFile) throws CustomException;
}
