package unit1_fundementals.sec8_RandomGenetrator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/*This time, reverse the roles. Think of a number from 1 to 100 and write a program which tries
to guess it. Type “higher” if the program guesses too low, or “lower” if the program guesses
too high. Have the program make subsequent guesses based on this information. When the
program guesses your number type “correct” and end the program
 */

public class guessCpu
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, Let me guess it :");
        int origin=1,bound=101;

        while (true)
        {

            int num = ThreadLocalRandom.current().nextInt(origin, bound);
            System.out.println(num);
            String answer = input.nextLine();

            if (answer.equals("high"))
                bound = num;

            else if (answer.equals("low"))
                origin = num;

            else if (answer.equals("correct"))
                break;

            else
                System.out.println("Invalid input");


            if (origin==bound)
            {
                System.out.println("\nThat's not possible. Let's try again.");
                origin=1;
                bound=101;
            }

        }

    }
}
