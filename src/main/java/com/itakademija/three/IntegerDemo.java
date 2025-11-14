package com.itakademija.three;

public class IntegerDemo {
     static void main(String[] args) {
         byte byteBroj = 127;

         short shortNumber = 32767;

         int number = 23; //DEFAULT

         //32 -> 16 bitni
         //1. step : number je vrijednost 32 bitna
         //2. step : ne smijem kaze ubacit to u 16bitni prostor..dok ne preuzme odgovornost za onih 16 bita koje moram otkinut
         //3. step : ubaci vrijednsot
         short shortNumber1 = (short) number; //EKSPLICITNA KONVERZIJA

         int number2 = shortNumber;//AUTOMATSKA KONVERZIJA

         //1. VRIJEDNOST: 32bitni zapis u kojem se nalazi "32"
         //2. konvertovan u 16 bitni zapis -> 32 + 32bita(ove dodatne bite samo stavi nula)
         //3. ubaci vrijednost
         long longNumber = 23L;
     }
     }