package com.codecool.interfacews;

import java.util.ArrayList;

public class WildAnimalList <E extends WildAnimal>{
    ArrayList<E> wildAnimals = new ArrayList<E>();

    public void add(E wildAnimal) {
        wildAnimals.add(wildAnimal);
    }
}
