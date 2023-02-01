package main.java.by.itacademy.array.service;

import java.util.Optional;

public interface ArrayService {
    Optional<Integer> searchMinMax(int[] array, int numberMinMax);
    void replacementElement (int[] array,int ordinalNumber, int newValue);
    Optional<Double>searchMeanValue(int[] array);
    Optional<Integer>searchSum(int[] array);
    Optional<Integer>searchNumberPositiveOrNegative(int[]array, int numberPositiveNegative);

}
