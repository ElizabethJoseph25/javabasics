package unit1_fundementals.sec4_arithmetic;

import java.util.Scanner;

public class RestoBill
{
    public static void main(String[] args)
    {
        System.out.println("Restaurant Bill calc: ");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total bill amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter the no: of people: ");
        int num = input.nextInt();

        double eachPay = amount/num;

        System.out.println("Each has to pay an amount of " + eachPay);
    }
}
