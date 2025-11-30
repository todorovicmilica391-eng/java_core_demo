package com.itakademija.five.array;

public class ArrayDemo {
    static void main(String[] args) {
        int number = 23;
        System.out.println(number);
        number = 26;
        System.out.println(number);
        //Ukoliko zelim varijablu koja moze upamtiti i 23 i 26 vrijednosti - niz kao TIP
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 26;
        //numbers[2] = 39; ArrayIndexOutOfBoundsException-Exception Error
        System.out.println("Element at index 0 = " + numbers[0]);
        System.out.println("Element at index 1 = " + numbers[1]);
        //System.out.println("Element at index 2 = " + numbers[2]);
        int[] numbers2 = {23,26,39,45};

    }
}
