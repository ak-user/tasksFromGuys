package com.taskOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.nextLine();
        StringBuffer reversedWord = new StringBuffer(word).reverse();
        if (word.equals("exit")) {
            System.out.println("I left the program! Bye!!");
        } else if (word.contentEquals(reversedWord)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
