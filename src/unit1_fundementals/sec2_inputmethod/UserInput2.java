package unit1_fundementals.sec2_inputmethod;
import java.util.Scanner;
public class UserInput2
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        //System.out.println(input);
        System.out.printf("You entered %s",input);

    }
}
