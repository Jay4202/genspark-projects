package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        // Storyline prompt
        System.out.println("You are in a land full of dragons. In front of you, you see two caves.");
               System.out.println( "in one cave the dragon is friendly and will share his treasure with you.");
        System.out.println(" the other dragon is greedy and hungry and will eat you on sight");
        System.out.println(  "which cave will you go into? (1 or 2?)");
        // user input will be an integer.
        int selection = input.nextInt();
        //instance of string object to hold the outcome
        String outcome;
        //conditional logic for chosing text depending on user input
        if (selection == 1){
            outcome = "gobbles you up in one bite!";
        }else{
            outcome = "Offers to share his treasure";
        }
        //string object to hold rest of text
        String story = "You approach the cave..." +
                "It is dark and spooky... "+
        "A large dragon jumps out in front of you! He opens his jaws and... ";

        // Printing out the end result for the user
        System.out.println(story + outcome);
    }
}
