package com.itakademija.four.operator;

import java.util.Scanner;

public class ArithmeticDemo {
    static void main(String[] args) {
        System.out.println("Dobro dosli u nas sistem..");
        System.out.println("Unesite prvi broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite drugi broj");
        int number2 = new Scanner(System.in).nextInt();

        int suma = number1 + number2;
        System.out.println("Suma = " + suma);
        int razlika = number1 - number2;
        System.out.println("Razlika = " + razlika);
        int multiplication = number1*number2;
        System.out.println("Proizvod = " + multiplication);
        int devision = number1/number2;
        System.out.println("Rezultat dijeljenja = " + devision);
        int remainder = number1 % number2;//36/11=3 i ostatak 3
        System.out.println("Ostatak od dijeljenja = " + remainder);

    }
}
