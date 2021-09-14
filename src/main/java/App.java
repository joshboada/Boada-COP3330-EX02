/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class App {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is the input string?");
        String name = input.nextLine();
        int cLength = name.length();

        System.out.printf(name + ", has " + cLength + " characters");

    }
}