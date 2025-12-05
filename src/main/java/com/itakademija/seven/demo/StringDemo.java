package com.itakademija.seven.demo;

public class StringDemo {
    static void main(String[] args) {
        String name = "Milica";
        String name2 = new String("Milica");
        String name3 = "Milica";

        System.out.println(name.equals(name2)); // true
        System.out.println(name.equals(name3)); // true
        System.out.println(name == name2); // false
        System.out.println(name == name3); // true

    }
}
