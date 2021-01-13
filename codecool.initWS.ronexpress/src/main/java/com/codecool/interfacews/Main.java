package com.codecool.interfacews;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static Main b1,b2;
    static Main l1,l2;
    static String[] birds = {"Sas","Fecske","Sirály","Ökörszem","Hárpia"};
    static String[] ladyBirds = {"Hétpettyes","Ötpettyes","Piros","Sárga","Szeplőtlen"};
    static UncleBen uncleBen = new UncleBen();
    static Wolf wolf1 = new Wolf();
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<Animals>();

        for (int i = 0; i < birds.length; i++) {
            animals.add(new Bird(birds[i], i%2==0));
        }
        for (int i = 0; i < ladyBirds.length; i++) {
            animals.add(new Ladybird(ladyBirds[i], i%2==1));
        }

        allFly(animals);
        allFeed(animals);

        Bird bird = new Bird("Sas",true);
        Dog dog = new Dog("Frakk");

        //uncleBen.feedBirds(animals); //nemm üxik mert nem jól vannak a tipusok megadva
        uncleBen.feedBirds2(animals); // müxik mert nem lett megadva milyen tipus lesz
        WildAnimalList<Wolf> wolfs = new WildAnimalList<Wolf>();
        wolfs.add(wolf1);

    }

    public static void allFly(List<Animals> animals){
        System.out.println("* Flying time *");
        for(Animals animal: animals){
            ((Flying) animal).fly();
        }
    }

    public static void allFeed(List<Animals> animals){
        System.out.println("* Feeding time *");
        for(Animals animal: animals){
            ((Feeding) animal).feed();
        }
    }

}
