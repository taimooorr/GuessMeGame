package org.thecodeguy.guessmegame;

import java.util.Random;
import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guess Me Game!");
        System.out.println("Enter Your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Press 1 to Start the Game!\nPress 2 to Exit the Game!");
        int beginAnswer = scanner.nextInt();
        if(beginAnswer==1){
            System.out.println("The Game has Started!");
            Random random = new Random();
            int randomNumber = random.nextInt(20) + 1;
            System.out.println("I have a number between 1 and 20. Can you guess it?\n\n Remember, you have 5 tries!");
            System.out.println("Enter your guess:");
            int userInput = scanner.nextInt();
            int Timetried = 0;
            boolean hasWon = false;
            boolean fnished = false;

            while (!fnished ){
                Timetried++;
                if(Timetried<5){
                    if(userInput==randomNumber){
                        System.out.println("You have won!");
                        System.out.println("You have tried " + Timetried + " times");
                        fnished = true;
                        hasWon = true;
                    }
                    else{
                        System.out.println("You have guessed wrong!");
                        int remaining = 5 - Timetried;
                        System.out.println("You have " + remaining + " tries left");
                        System.out.print("Enter your guess Again : ");
                        userInput = scanner.nextInt();


                    }

                }
                else{
                    System.out.println("You have exceeded the maximum number of tries. You have lost!");
                    fnished = true;
                }

            }
            if(hasWon){
                System.out.println("Congratulations! You have won the game!");
            }
            else{
                System.out.println("You have lost the game!");
                System.out.println("The correct answer was " + randomNumber);
            }

        }
        else{
            System.out.println("Game Exited!");
        }

    }


}

