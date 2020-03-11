package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Welcome To Number Guesser \n");

        System.out.print("Guess my number between 1 and 10 \n");

        Scanner scanner = new Scanner(System.in);

        int guess = scanner.nextInt();

        while (!guessCheck(guess)) {
            System.out.print("Wrong, Try Again \n");
            guess = scanner.nextInt();
        }

        System.out.print("You got it! :)");

    }

    private static int generateRandomNumber() {
        Random rn = new Random();

        return rn.nextInt(10) + 1;
    }

    private static boolean  guessCheck(int guess) {
        int randomNum = generateRandomNumber();

        if (guess != randomNum) {
            return false;
        }

        return true;
    }
}
