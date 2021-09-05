/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Psuedo
ask user for a string using print
gather the string with scanner(system.in)(keyboard)
determine the length(with spaces) with the built in .length() function
return the string and the length in one print statement
 */
package exercise02;
import java.util.Scanner;

public class solution02 {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the input string?");

        String sentence = input.nextLine();

        int length = sentence.length();

        System.out.print(sentence + " has "+ length + " Characters, including spaces.");
    }

}

