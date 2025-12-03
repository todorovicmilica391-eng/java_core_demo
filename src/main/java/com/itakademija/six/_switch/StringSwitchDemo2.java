package com.itakademija.six._switch;

import java.util.Scanner;

public class StringSwitchDemo2 {
    static void main(String[] args) {
        System.out.println("Bitte schreiben Sie TagName");
        String dayName = new Scanner(System.in).nextLine();
        int weekDayNumber = switch (dayName){
           case "Montag" -> 1;
           case "Dienstag" -> 2;
           case "Mittwoch" -> 3;
           case "Donerstag" -> 4;
           case "Freitag" -> 5;
           case "Samstag" -> 6;
           case "Sonntag" -> 7;
            default -> 0;
        };
        String message = "Za uneseni dan na nemackom " + dayName + "redni broj dana je" + weekDayNumber;
        System.out.println(message);
    }
}
