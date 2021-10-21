package unit1_fundementals.sec2_inputmethod;

import java.util.Scanner;

public class questionanser
{
    public static void main(String[] args)
    {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        System.out.println(userName + " is a nice name.");

        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Your name is " + userName + " and you are " + age + " years old.");

    }
}
