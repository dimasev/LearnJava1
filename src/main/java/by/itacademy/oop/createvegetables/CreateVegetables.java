package main.java.by.itacademy.oop.createvegetables;

import main.java.by.itacademy.oop.entity.Vegetables;
import main.java.by.itacademy.oop.exception.CustomException;

import java.util.List;

public interface CreateVegetables {
    List<Vegetables> createBillet(List<String> strings) throws CustomException;

    Vegetables createCucumber(String[] strings) throws CustomException;

    Vegetables createCabbage(String[] strings) throws CustomException;

    Vegetables createTomato(String[] strings) throws CustomException;
}