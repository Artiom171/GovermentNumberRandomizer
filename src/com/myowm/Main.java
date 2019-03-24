package com.myowm;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        char letter = 'a';
        char[] letters = new char[26];
        for (int i = 0; i < 26; i++) {
            letters[i] = Character.toUpperCase(letter);
            letter++;
        }
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.print(letters[random.nextInt(26)]);
            System.out.print(letters[random.nextInt(26)]);
            System.out.print(letters[random.nextInt(26)]);
            System.out.print(random.nextInt(999));
            System.out.println();
        }


    }
}
