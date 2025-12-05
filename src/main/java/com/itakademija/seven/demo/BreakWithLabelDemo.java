package com.itakademija.seven.demo;

import java.util.Scanner;

public class BreakWithLabelDemo {
    static void main(String[] args) {
        int[][] arryOfNumbers = {
                {32, 87, 3, 589},//i=0 -> j = 0, 1, 2, 3
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        System.out.println("Unesi celi broj i okusaj srecu");
        int enteredNumber = new Scanner(System.in).nextInt();
        String message ="Nesretan pokusaj";


        Milica:
        for (int i = 0; i<arryOfNumbers.length; i++){
            for (int j  = 0; j < arryOfNumbers[i].length; j++){
                int numberInArray = arryOfNumbers[i][j];//32, 87, 3
                if (numberInArray == enteredNumber){
                    message = "Sretan pokusaj broj se nalazi na [ " + i + " ] [ " + j + " ]";
                    break Milica;
                }
            }
        }
        System.out.println(message);
    }
}
