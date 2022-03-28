package com.company;

import java.util.Scanner;

public class Concatenator {
    public static void main(String[] args){
        String word1, word2;
        Scanner s = new Scanner(System.in);

        System.out.print("Put first word: ");
        word1 = s.next();
        System.out.print("Put second word: ");
        word2 = s.next();

        word1 = word1.concat(word2);

        System.out.println("The output is: " + word1);
        System.out.println(word1.compareTo(word2));
        System.out.println(word1.equalsIgnoreCase(word2));

    }
}
