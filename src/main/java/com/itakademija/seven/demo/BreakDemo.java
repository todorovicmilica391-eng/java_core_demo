package com.itakademija.seven.demo;

import java.util.Scanner;

public class BreakDemo {
    static void main(String[] args) {
        int[] arryOfNumbers = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        System.out.println("Unesi celi broj i okusaj srecu");
        int enteredNumber = new Scanner(System.in).nextInt();
        String message ="Nesretan pokusaj";
        int index;
        for (int i = 0; i<arryOfNumbers.length; i++){
            //nacin da pristupite vrednosti elementa na idexsu i
            int numberInArray = arryOfNumbers[i];
            if (numberInArray == enteredNumber){
                message = "Sretan pokusaj broj se nalazi na {" + i + "}";
                break;
            }
        }
        System.out.println(message);
    }
}
