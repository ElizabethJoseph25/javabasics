package unit1_fundementals.sec13_oops;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RectanleArea r = new RectanleArea();

        r.width=9;
        r.height=10;
        r.printArea();
        System.out.println("Enter radius: ");
        int inputRadius = input.nextInt();
        r.setRadius(inputRadius);
        r.printCircle();

    }

}
