package com.itakademija.eight.zadatak;

public class Zadatak1 {
    static void main(String[] args) {
       String text = "Petar Pan je pojeo pet plavih sljiva";
       char[] arrayOfChars = text.toCharArray();
       int counter = 0;
       char maloSlovoP = 'p';
       char velikoSlovoP = 'P';
       for (int i = 0; i<arrayOfChars.length; i++){
           char slovo = arrayOfChars[i];
           if (slovo == 'p' || slovo == 'P'){
               counter++;
           }
       }
        String message = "Slovo p ili P se nalazi u datom tekstu %s puta".formatted(counter);
        System.out.println(message);
    }
}
