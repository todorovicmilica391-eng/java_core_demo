package com.itakademija.eight.zadatak;

public class Zadatak3 {
    static void main(String[] args) {
       String sentence = "Pogledaj kroz prozor i videces da pada sneg";
       String word = "proz";

       char[] nizSlovaRecenice = sentence.toCharArray();
       char[] nizSlovaReci = word.toCharArray();
       boolean recSadrzana = false;
       LABELA:
       for (int i = 0; i<nizSlovaRecenice.length; i++) {
           char slovoRecenice = nizSlovaRecenice[i];
           for (int j = 0; j< nizSlovaReci.length; j++){
               char slovoReci = nizSlovaReci[j];
               // P == p
               if (slovoReci != slovoRecenice){
                   continue LABELA; // i++
               }
           }
           recSadrzana = true;
           break;
       }
        System.out.println(recSadrzana ? "Rec sadrzana" : "Nije sadrzana");
    }
}
