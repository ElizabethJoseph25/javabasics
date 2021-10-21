package unit1_fundementals.sec4_arithmetic;

import java.util.Scanner;

public class stringLength
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        int namelen = firstName.length();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.format("“You’ve lived %d years.In another %d years you’ll be %d years old",age,age,2*age);
        System.out.println("\nThe length of name is " + namelen);

    }
}
