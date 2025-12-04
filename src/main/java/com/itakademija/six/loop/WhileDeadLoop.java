package com.itakademija.six.loop;

import java.util.Scanner;

public class WhileDeadLoop {
    static void main(String[] args) {
        int tajniBroj = 23;
        while (true){
            System.out.println();
            System.out.println("Unesi broj");
            int uneseniBroj = new Scanner(System.in).nextInt();
            if (uneseniBroj == tajniBroj) {
                System.out.println("Uneli ste magicni broj");
                break;
            }else {
                System.out.println("Niste pogodili, pokusaj ponovo...");
            }
        }
    }
}
