package main.java.by.itacademy.array.service.impl;

import main.java.by.itacademy.array.service.ArrayService;

import java.util.Optional;

public class ArrayServiceImpl implements ArrayService {


    @Override
    public Optional<Integer> searchMinMax(int[] array, int numberMinMax) {
        int numberResult = 0;
        if(numberMinMax>0){
            numberResult = array[0];
            for(int i = 1;i< array.length;i++){
                if (numberResult<array[i]){
                    numberResult = array[i];
                }
            }
        }
        else if(numberMinMax<0){
            numberResult = array[0];
            for(int i = 1;i< array.length;i++){
                if (numberResult>array[i]){
                    numberResult = array[i];
                }
            }
        }
        return Optional.of(numberResult);
    }

    @Override
    public void replacementElement(int[] array, int ordinalNumber, int newValue) {
        array[ordinalNumber] = newValue;
    }

    @Override
    public Optional<Double> searchMeanValue(int[] array) {
        double meanValue = 0;
        int sum = 0;
        for(int i = 0; i <array.length;i++){
            sum+=array[i];
        }
        meanValue = sum/ array.length;
        return Optional.of(meanValue);
    }

    @Override
    public Optional<Integer> searchSum(int[] array) {
        int sum = 0;
        for(int i:array){
            sum+=array[i];
        }
        return Optional.of(sum);
    }

    @Override
    public Optional<Integer> searchNumberPositiveOrNegative(int[] array, int numberPositiveNegative) {
        int numberResult = 0;
        if(numberPositiveNegative>0){
            for(int i = 0; i <array.length;i++){
                if(array[i]>0){
                    numberResult++;
                }
            }
        }
        else if(numberPositiveNegative<0){
            for(int i = 0; i <array.length;i++){
                if(array[i]<0){
                    numberResult++;
                }
            }
        }
        return Optional.of(numberResult);
    }


}
