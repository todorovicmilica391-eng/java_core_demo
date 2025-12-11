package com.itakademija.nine.demo;

public class Demo {
    static void main(String[] args) {
      int number = 23;
       System.out.println(number);
        number = 13;
        System.out.println(number);

        // prvi slozen tip podatka
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 13;
        // enhanced for loop
//       for (int broj: numbers ){
//            System.out.println(broj+" ");
//        }
        System.out.println();
        // dva ogranicenja

        Movie movie1 = new Movie();
        movie1.setName("Prohujalo sa vihorom");
        movie1.setDirector ("Victor Flaming");
        movie1.setEvaluation(10);
        System.out.println(movie1.getName() + " " + movie1.getEvaluation());

        Movie movie2 = new Movie();
        movie2.setDirector("Spiderman");
        movie2.setDirector("Sam Raimi");
        movie2.setEvaluation(29);
        System.out.println(movie2.getName() + " " + movie2.getDirector() + " " + movie2.getEvaluation());


        Person p1 = new Person("Djordje","Knezevic");
        p1.setName("Djordje");
        p1.setSurname("Balasevic");
        p1.setAge(60);
    }

}
