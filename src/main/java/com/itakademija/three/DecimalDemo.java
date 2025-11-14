package com.itakademija.three;

public class DecimalDemo {
    static void main(String[] args) {
        /**
          * U Javi imamo 2 primitivna tipa za decimalne brojeve
          * float ->  32 bitni
          * double -> 64 bitni (DEFAULT)
          */
        float floatNumber = (float) 10.3; //LOSIJI NACIN
        float floatNumber3 = 10.3F;//BOLJI NACIN

        double doubleNumber = 10.3;

         /**
          * Nikada nemojte koristiti double i float zua finansijske ili neke proracune
          * koji zahtjevaju decimalnu preciznost
          */
         double number1 = 0.1;
         double number2 = 0.2;
         double suma = number1 + number2;

         System.out.println("Da li je suma = 0.3 ? Odgovor: "+ (suma == 0.3 ));
         System.out.println("Suma = " + suma);


         double broj1 = 0.3;
         double broj2 = 0.2;
         double zbir = broj1 + broj2;

         System.out.println("Da li je zbir = 0.5 ? Odgovor: "+ (zbir == 0.5 ));
         System.out.println("Zbir = " + zbir);
    }
}
