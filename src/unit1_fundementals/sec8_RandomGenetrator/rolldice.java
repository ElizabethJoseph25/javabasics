package unit1_fundementals.sec8_RandomGenetrator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class rolldice
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String choice;
        do
        {
            int roll = ThreadLocalRandom.current().nextInt(1,7);
            System.out.println("You rolled a " + roll);
            System.out.println("Wanna roll again? y/n ");
            choice = input.next();

        }while(choice.equals("y"));

    }

}
