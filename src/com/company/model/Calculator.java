package com.company.model;

public class Calculator implements BaseUi{


    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }
}
