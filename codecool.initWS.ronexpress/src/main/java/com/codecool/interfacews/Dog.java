package com.codecool.interfacews;

public class Dog implements Flying, Speeking, Feeding{
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void feed() {

    }

    @Override
    public void fly() {

    }
}
