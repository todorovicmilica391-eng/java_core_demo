package com.itakademija.four;

import java.io.SequenceInputStream;
import java.util.Scanner;

public class BooleanDemo {
    static void main(String[] args) {
        System.out.println("Hej zdravo. Upisi omiljeni broj");
        int omiljeniBroj = new Scanner(System.in).nextInt();
        boolean condition = omiljeniBroj==23;//true ili fals
        if(condition){
            System.out.println("Zadovoljio si..");
        }else{
            System.out.println("Nisi zadovoljio..");
        }
    }
}
