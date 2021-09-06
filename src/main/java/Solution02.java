/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create input scanner
ask for input string
use scanner to get input
print string and .length()
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string? ");

        // Get input string then print number of chars
        String str = input.nextLine();
        System.out.printf("%s has %d characters.", str, str.length());
    }
}
