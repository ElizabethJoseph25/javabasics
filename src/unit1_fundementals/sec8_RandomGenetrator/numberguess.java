package unit1_fundementals.sec8_RandomGenetrator;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class numberguess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomnum = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Game Now!!");

        int guess;


        while (true) {

            System.out.println("Guess any number between 1 and 100!");
            guess = input.nextInt();

            if (randomnum == guess) {
                System.out.println("Correct! Your number was " + guess);
                break;
            } else if (randomnum < guess) {
                System.out.println("HIGHER!!");
            } else {
                System.out.println("LOWER!!");
            }

            System.out.println("Try again!");


        }
    }
}
