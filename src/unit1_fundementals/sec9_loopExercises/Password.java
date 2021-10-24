package unit1_fundementals.sec9_loopExercises;
import java.util.Scanner;

public class Password
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        do
        {
            System.out.println("Enter the password: ");
            password = input.nextLine();

            if(password.equals("shark50"))
            {
                System.out.println("ACCESS APPROVED");
                break;
            }
            else
            {
                System.out.println("Wrong! type again..");
            }

        }while (true);

    }
}
