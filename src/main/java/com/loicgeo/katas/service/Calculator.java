package com.loicgeo.katas.service;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> numbers;
    private Integer result;

    public Calculator() {
        numbers = new ArrayList<>();
        result = 0;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void addNumber(Integer number) {
        if (numbers == null) {
            numbers = new ArrayList<>();
        }
        numbers.add(number);
    }

    public void addition() {
        result = numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public void divide() {
        result = numbers.get(0) / numbers.get(1);
    }
}