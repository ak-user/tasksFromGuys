package com.taskOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word;
        String reversedWord = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");

        word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (word.equals("exit")) {
            System.out.println("I left the program! Bye!!");
        } else if (word.contentEquals(reversedWord)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
