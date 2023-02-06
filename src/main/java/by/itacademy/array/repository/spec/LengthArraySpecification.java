package main.java.by.itacademy.array.repository.spec;

import main.java.by.itacademy.array.entity.ArrayObject;

public class LengthArraySpecification implements Specification {
    private int lengthArray;

    public LengthArraySpecification(int lengthArray) {
        this.lengthArray = lengthArray;
    }

    @Override
    public boolean specify(ArrayObject array) {
        return array.getArray().length == lengthArray;
    }
}
