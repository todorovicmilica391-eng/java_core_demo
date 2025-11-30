package com.itakademija.five.flow;

import java.util.Scanner;

public class SwitchDemo {
    static void main(String[] args) {
        System.out.println("Unesite redni broj u sedmici za koji zelite saaznati ime na Nemackom jeziku:");
        int weekDayNumber = new Scanner(System.in).nextInt();
        //if(expression ili izraz ciji je evaluirana vrednost TIPA boolean ili true ili false)
        //u switch konstrukt izlazi ili int ili nesto sto je konvertibilno u integer...JDK 1.7 (input i String)
        String dayName;
        switch (weekDayNumber){
            case 1:
                //blok koda koji se izvrsava kada je weekDayNumber=1
                  dayName = "Montag";
                break;
            case 2:
                dayName = "Dienstag";
                break;
            case 3:
                dayName = "Mittwoch";
                break;
            case 4:
                dayName = "Donnerstag";
                break;
            case 5:
                dayName = "Freitag";
                break;
            case 6:
                dayName = "Samstag";
                break;
            case 7:
                dayName = "Sonntag";
                break;
            default:
                dayName = "Sedmica ima 7 dana i unesi broj izmedju 1 i 7";
                break;
        }
        System.out.println(dayName);
    }
}
