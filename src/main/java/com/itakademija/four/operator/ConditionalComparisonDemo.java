package com.itakademija.four.operator;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class ConditionalComparisonDemo {
    static void main(String[] args) {
        System.out.println("Unesite broj 1");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj 2");
        int number2 = new Scanner(System.in).nextInt();
        if ((number1 == 23) && (number2 < 10)){
            System.out.println("Michael Jordan i neki fudbaler");
        }

        if ((number1 == 23) || (number2 < 10)){
            System.out.println("Ili je Michael Jordan ili je neki fudbaler");

        }

    }
}
