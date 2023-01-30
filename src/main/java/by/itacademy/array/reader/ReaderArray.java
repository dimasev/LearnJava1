package main.java.by.itacademy.array.reader;

import main.java.by.itacademy.oop.exception.CustomException;

import java.io.File;
import java.util.List;

public interface ReaderArray {
    int [][] readArray(File file) throws CustomException;
}
