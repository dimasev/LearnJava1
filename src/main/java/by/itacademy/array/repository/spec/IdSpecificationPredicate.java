package main.java.by.itacademy.array.repository.spec;

import main.java.by.itacademy.array.entity.ArrayObject;

public class IdSpecificationPredicate implements SpecificationPredicate{
    private int id;

    public IdSpecificationPredicate(int id) {
        this.id = id;
    }

    @Override
    public boolean test(ArrayObject array) {
        return array.getIdArray() == id;
    }
}
