package com.itakademija.nine.demo;

public class PersonDemo {
    static void main(String[] args) {
        //name, surname, age
        Person person1 = new Person("Djordje","Knezevic");
        System.out.println("Momenat rodjenja: " + person1.getName()+ " " + person1.getSurname());
        person1.setSurname("Zenino");
        System.out.println("Momenat rodjenja: " + person1.getName()+ " " + person1.getSurname());
        person1.setAge(60);
    }
}
