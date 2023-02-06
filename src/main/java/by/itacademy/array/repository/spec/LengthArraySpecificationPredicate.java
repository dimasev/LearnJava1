package main.java.by.itacademy.array.repository.spec;

import main.java.by.itacademy.array.entity.ArrayObject;

public class LengthArraySpecificationPredicate implements SpecificationPredicate{
    private int lengthArray;
    @Override
    public boolean test(ArrayObject array) {
        return array.getArray().length == lengthArray;
    }
}
