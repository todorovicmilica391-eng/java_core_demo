package com.itakademija.six._switch;

import java.util.Scanner;

public class StringSwitchDemo {
    static void main(String[] args) {
        System.out.println("Bitte schreiben Sie TagName");
        String dayName = new Scanner(System.in).nextLine();
        int weekDayNumber;
        switch (dayName){
            case  "Montag":
                weekDayNumber = 1;
                break;
            case  "Dienstag":
                weekDayNumber = 2;
                break;
            case  "Mittwoch":
                weekDayNumber = 3;
                break;
            case  "Donnerstag":
                weekDayNumber = 4;
                break;
            case  "Freitag":
                weekDayNumber = 5;
                break;
            case  "Samstag":
                weekDayNumber = 6;
                break;
            case  "Sonntag":
                weekDayNumber = 7;
                break;
            default:
                weekDayNumber = 0;
                break;
        }

        String message = "Za uneseni dan na nemackom " + dayName + "redni broj dana je" + weekDayNumber;
        System.out.println(message);
    }
}
