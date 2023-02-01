package main.java.by.itacademy.array.creator.impl;

import main.java.by.itacademy.array.creator.CreatorArray;
import main.java.by.itacademy.array.entity.ArrayObject;

public class CreatorArrayImpl implements CreatorArray {

    @Override
    public void  creatorArray(int[] array) {
        new ArrayObject(array);
    }
}
