package com.itakademija.nine.demo;

public class Demo1 {
    static void main(String[] args) {
        int brojac = Movie.getCounter();
        System.out.println("Brojac = " +brojac);
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
    }
}
