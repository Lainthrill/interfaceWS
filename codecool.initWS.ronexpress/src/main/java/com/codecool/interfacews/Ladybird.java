package com.codecool.interfacews;

public class Ladybird extends Animals implements Flying, Speeking, Feeding{
    private boolean isFemale;
    private String name;

    public Ladybird(String name, boolean isFemale) {
        this.isFemale = isFemale;
        this.name = name;
    }

    @Override
    public void fly() {
        speak(name + " say: Buzz, Buzz");
    }

    @Override
    public void feed() {
        speak(name + " say: I love aphid");
    }

}
