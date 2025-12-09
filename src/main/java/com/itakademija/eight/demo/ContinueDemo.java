package com.itakademija.eight.demo;

public class ContinueDemo {
    static void main(String[] args) {
        String text = "Petar Pan je pojeo pet plavih sljiva";
        int counter = 0;
        for (int i = 0; i<text.length(); i++){
            char slovoText = text.charAt(i);
            if (slovoText!='p' && slovoText!='P') {
                continue;
            }
            counter++;
        }
        String message = "Slovo p se nalazi u datom tekstu P puta ".formatted(counter);
        System.out.println(message);
    }
}
