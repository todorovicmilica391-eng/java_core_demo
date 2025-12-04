package com.itakademija.six.loop;

import java.util.Scanner;

public class DeadForLoopDemo {
    static void main(String[] args) {
        int tajniBroj = 23;
        //for(; ;){
        //}
        for (; ;){
            System.out.println();
            System.out.println("Unesi broj");
            int unosKorisnika = new Scanner(System.in).nextInt();
            if (unosKorisnika == tajniBroj){
                System.out.println("Uneli ste magicni broj");
                break;
            }else{
                System.out.println("Niste pogodili");
            }
        }
    }
}
