package com.itakademija.five.flow;

import java.util.Scanner;

public class IfElseDemo {
    static void main(String[] args) {
        System.out.println("Unesite broj ostvarenih poena: ");
        int score = new Scanner(System.in).nextInt();
        char grade; //varijabla koja ce definisati ocenu na osnovu score
        // grade = f(score) -> y = f(x)
        if (score >= 90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        }else if (score >= 70 ){
            grade = 'C';
        }else if (score >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Ocena na ispitu je = " + grade);
    }
}
