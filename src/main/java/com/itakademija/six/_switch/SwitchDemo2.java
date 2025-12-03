package com.itakademija.six._switch;

import java.util.Scanner;

public class SwitchDemo2 {
    static void main(String[] args) {
        System.out.println("Unesite redni broj meseca:");
        int redniBrojMeseca = new Scanner(System.in).nextInt();
        System.out.println("Unesite i godinu: ");
        int godina = new Scanner(System.in).nextInt();
        int brojDana = switch (redniBrojMeseca){
            case 1, 3, 5, 7, 8, 10, 12 ->31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                boolean prestupna = (godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0);
                yield prestupna ? 29 : 28;
            }
            default -> 0;
        };
        System.out.println("Za uneseni mesec" + redniBrojMeseca + " i godinu" + godina + "broj dana je jednak = " + brojDana);
    }
}
