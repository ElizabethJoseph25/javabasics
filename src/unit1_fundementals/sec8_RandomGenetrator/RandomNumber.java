package unit1_fundementals.sec8_RandomGenetrator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class RandomNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int randomnum;
        System.out.println("Game Now!!");

        int guess;
        int i=0;

        while (i<2)
        {
            randomnum = ThreadLocalRandom.current().nextInt(1,6);

            System.out.println("Guess any number between 1 and 5!");
            guess = input.nextInt();

            if (randomnum==guess)
            {
                System.out.println("Correct! Aren’t you lucky.");
            }
            else
            {
                System.out.println("Hard luck! Maybe next time.");
            }

            System.out.println("Try again!");

            i++;


        }

    }
}
