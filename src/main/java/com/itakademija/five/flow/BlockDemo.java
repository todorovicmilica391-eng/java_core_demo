package com.itakademija.five.flow;

import java.util.Scanner;

public class BlockDemo {
    static void main(String[] args) {
        System.out.println("Unesi neki broj i proveri da li si sretan ?!..");
        int number = new Scanner(System.in).nextInt();
        boolean happinessCondition = number <= 23;
        if (happinessCondition){
            System.out.println("Sretni ste...");
        }else{
            System.out.println("Niste bas srecni..");
        }

    }
}
