package com.codecool.interfacews;

public class Bird extends Animals implements Flying, Speeking, Feeding {
    private String name;
    private boolean isFemale;

    public Bird(String name, boolean isFemale) {
        this.isFemale = isFemale;
        this.name = name;
    }

    @Override
    public void fly() {
        speak(name + " say: Csájp, Csájp");
    }

    @Override
    public void feed() {
        speak(name + " say: What a wonderful worm");
    }

    @Override
    public void speak(String say) {

    }
}
