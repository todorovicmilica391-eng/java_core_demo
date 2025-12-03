package com.itakademija.six._switch;

import java.util.Scanner;

public class SwitchCaseDemo {
    static void main(String[] args) {
        System.out.println("Unesi redni broj dana u sedmici");
        int dayWeekNumber = new Scanner(System.in).nextInt();
        String preostaliDani = "";
        switch (dayWeekNumber){
            case 1:
                preostaliDani = preostaliDani + "Montag";

            case 2:
                preostaliDani = preostaliDani + "Dienstag";

            case 3:
                preostaliDani = preostaliDani + "Mittwoch";
            case 4:
                preostaliDani = preostaliDani + "Donnerstag";

            case 5:
                preostaliDani = preostaliDani + "Freitag";

            case 6:
                preostaliDani = preostaliDani + "Samstag";

            case 7:
                preostaliDani = preostaliDani + "Sonntag";
                break;

            default:
                System.out.println("Sedmica ima 7 dana i zato i jeste sedmica");
        }
        System.out.println(preostaliDani);
    }
}
