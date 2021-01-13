package com.codecool.interfacews;

public interface Speeking {
    public default void speak(String say){
        System.out.println(say);
    }
}
