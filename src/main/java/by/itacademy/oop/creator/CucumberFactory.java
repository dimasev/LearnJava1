package main.java.by.itacademy.oop.creator;

import main.java.by.itacademy.oop.entity.Cucumber;
import main.java.by.itacademy.oop.entity.Tomato;
import main.java.by.itacademy.oop.entity.Vegetables;
import main.java.by.itacademy.oop.exception.CustomException;

import java.util.ArrayList;
import java.util.List;

public class CucumberFactory extends VegetablesFactory {
    @Override
    public Vegetables createVegetables(String[] stringCucumber) throws CustomException {
        String name = stringCucumber[0];
        boolean stateOfPurity = Boolean.parseBoolean(stringCucumber[1]);
        int price;
        int weight;
        int calories;
        List<Integer> listInt = new ArrayList<>();
        int number;
        for (int i = 2; i < stringCucumber.length; i++) {
            try {
                number = Integer.parseInt(stringCucumber[i]);
                listInt.add(number);

            } catch (NumberFormatException e) {
                throw new CustomException(e);
            }
        }

        price = listInt.get(0);
        weight = listInt.get(1);
        calories = listInt.get(2);

        return new Cucumber(name, stateOfPurity, price, weight, calories);
    }
}
