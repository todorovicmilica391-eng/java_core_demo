package com.itakademija.five.flow;

import java.util.Scanner;

public class SwitchDemo2 {
    static void main(String[] args) {
        System.out.println("Unesite redni broj u sedmici za koji zelite saaznati ime na Nemackom jeziku:");
        int weekDayNumber = new Scanner(System.in).nextInt();
        //if(expression ili izraz ciji je evaluirana vrednost TIPA boolean ili true ili false)
        //u switch konstrukt izlazi ili int ili nesto sto je konvertibilno u integer...JDK 1.7 (input i String)
        // dayName = f(weekDayNumber) -> y = (x)
        //Java 12 -> kljucna rec "yield"
        //TIP imeVarijable = VREDNOST; dayName = f(weekDayNumber)
        //Java 17 : Pattern Matching zajedno sa instanceOf...switch nad tipovima
        String dayName = switch (weekDayNumber) {
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "Sedmica ima 7 dana i unesi broj izmedju 1 i 7";
        };

        System.out.println(dayName);
    }
}
