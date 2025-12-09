package com.itakademija.eight.zadatak;

import java.util.Scanner;

public class Zadatak2 {
    static void main(String[] args) {
        String text = "Petar Pan je pojeo pet plavih sljiva";
        System.out.println("Unesi slovo: ");
        char slovo = new Scanner(System.in).next().charAt(0);
        char[] arrayOfChars = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            char charInArray = arrayOfChars[i];
            if (charInArray == slovo) {
                counter++;
            }
        }

        String message = "Slovo %s se nalazi u datom tekstu %s puta ".formatted(slovo, counter);
        System.out.println(message);
    }
}
