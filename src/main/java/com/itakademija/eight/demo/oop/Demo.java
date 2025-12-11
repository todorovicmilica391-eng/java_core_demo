package com.itakademija.eight.demo.oop;

public class Demo {
    static void main(String[] args) {
      Person person = new Person();
      person.nin = 12345;
      person.name = "Jelena";
      person.surname = "Petkovic";

      int hashCode = person.hashCode();
      String personString = person.toString();
        System.out.println(hashCode + " --> " + personString);

    }
}
