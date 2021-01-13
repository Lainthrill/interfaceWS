package com.codecool.interfacews;

import java.util.List;

public class UncleBen {
    public void feedBirds(List<Bird> birds) {
        for (Bird b : birds) {
            b.feed();
        }
    }

    public void feedBirds2(List birds) {
        for (Object b : birds) {
            if (b instanceof Bird) {//Bird class-nak a példánya-e
                ((Bird) b).feed();
            }
        }
    }



}
