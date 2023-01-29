package main.java.by.itacademy.oop.creator;

import main.java.by.itacademy.oop.entity.Vegetables;
import main.java.by.itacademy.oop.exception.CustomException;

public abstract class VegetablesFactory {
    public abstract Vegetables createVegetables(String[] stringVegetables) throws CustomException;
}
