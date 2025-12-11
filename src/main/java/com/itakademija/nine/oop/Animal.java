package com.itakademija.nine.oop;

public abstract class Animal {

    private  String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void playSound();

    public String getName() {
        return name;
    }
}
