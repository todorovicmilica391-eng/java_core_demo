package com.itakademija.five.array;

public class MultiDimArrayDemo {
    static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Anja";
        names[1] = "Milica";
        names[2] = "Voja";
        String[] names2 = {"Anja","Milica","Voja"};
        char slovo ='w';
        String[][] array = {
                {"Her", "Frau", "Her"},
                {"Anja","Milica","Voja"}
        };
        System.out.println(array[0][1]+ " " + array[1][1]);
        System.out.println(array[0][0]+ " " + array[1][0]);
        System.out.println(array[0].length);// 2
        System.out.println(array[1].length);// 3
        System.out.println(array[0][2] + " " + array[1][2]);


    }
}
