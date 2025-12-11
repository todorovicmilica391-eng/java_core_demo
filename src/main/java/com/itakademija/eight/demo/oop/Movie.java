package com.itakademija.eight.demo.oop;

public class Movie {

    String title;
    String direector;
    // 1-10
    private int evaluation;

    public void setEvaluation(int ocena){
        if (ocena<=0){
            this.evaluation = 1;
        }else if (ocena>10){
            this.evaluation = 10;
        }else{
            this.evaluation = ocena;
        }
    }


    public int getEvaluation(){
        return this.evaluation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
