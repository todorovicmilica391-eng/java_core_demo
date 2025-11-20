package com.itakademija.four.operator;

import java.util.Scanner;

public class ConditionalTernaryDemo {
    static void main(String[] args) {
        System.out.println("Koliko je 2+2?");
        int result = new Scanner(System.in).nextInt();
        boolean uslovTacnosti = result == 4;
                // "Tacno" ili "Netacno"
        String message;
        if (uslovTacnosti){
            message = "Tacno";
        }else{
            message = "Netacno";
        }
        System.out.println(message);
    }
}
