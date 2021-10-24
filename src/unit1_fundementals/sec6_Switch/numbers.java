package unit1_fundementals.sec6_Switch;

import java.util.Scanner;

public class numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number: ");
        int num = input.nextInt();

        switch (num)
        {
            case 1:
            {
                System.out.println("you entered one");
                break;
            }

            case 2:
            {
                System.out.println("you entered two");
                break;
            }
            default:
            {
                System.out.println("Invalid number");
            }
        }


    }
}
