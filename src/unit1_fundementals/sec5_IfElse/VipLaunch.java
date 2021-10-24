package unit1_fundementals.sec5_IfElse;

import java.util.Scanner;

public class VipLaunch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the VIP Launch!");

        System.out.print("what is your age: ");
        int age = input.nextInt();

        System.out.print("\n Do you have a VIP Pass? yes/no:" );
        String haspass = input.next();

        if(age>=18)
        {
            if (age>70)
            {
                System.out.println("\n ");
            }
        }

        if(( age>=18 && haspass.equals("yes")) || age>70 )
        {
            System.out.println("\n Thanks, Go in");
        }
        else
        {
            System.out.println("Sorry, no can do");
        }

    }
}
