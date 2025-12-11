package com.itakademija.nine.demo;

public class Movie {

    private static int counter = 0;

   private String name;
   private String Director;
   // 1-10 -> ENKAPSULACIJE
   private int evaluation;

   public Movie(){
       counter++;
   }

   //Funkcija ili Metoda -> je blok koda koji se izvsava kad ga pozovemo
    public void setEvaluation(int parametar){
        if (parametar<=0){
            this.evaluation = 1;
        }
        if (parametar>=10){
            this.evaluation = 10;
        }
       this.evaluation = parametar;
    }

    public int getEvaluation(){
        return evaluation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public static int getCounter() {
        return counter;
    }
}
