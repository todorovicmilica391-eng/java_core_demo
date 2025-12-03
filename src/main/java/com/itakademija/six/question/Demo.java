package com.itakademija.six.question;

import java.util.Scanner;

public class Demo {
    static void main(String[] args) {
       // U cemu je razlika izmedju if-else vs switch
       int number = new Scanner(System.in) .nextInt();
       //if konstrukt kao input/ulazni proma samo BOOLEAN true/false
       if (number == 23){
           System.out.println("To je taj..");
       }

       //switch konstrukt kao input/ulazni parm prima INT ili nesto konvertibilno u int
        switch (number){
           case 23:
               System.out.println("To je taj..");
           break;
       }
    }
}
