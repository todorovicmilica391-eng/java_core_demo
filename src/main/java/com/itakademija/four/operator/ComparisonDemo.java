package com.itakademija.four.operator;

import java.util.Scanner;

public class ComparisonDemo {
    static void main(String[] args) {
        System.out.println("Unesite broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj:");
        int number2 = new Scanner(System.in).nextInt();
        if (number1 == number2){
            System.out.println("Brojevi su jednaki");
        }
        if (number1!=number2){
            System.out.println("Brojevi su razliciti");
        }

    }
}
