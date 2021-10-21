package unit1_fundementals.sec3_Format;

import java.util.Scanner;

public class AvgHeightDiff
{
    public static void main(String[] args)
    {
        System.out.println("How tall are you in meters?");
        Scanner input = new Scanner(System.in);
        Double height = input.nextDouble();

        Double AvgMaleHeightDiff = height - 1.75;
        Double AvgFemaleHeightDiff = height - 1.62;

        System.out.println("The average height difference is: ");
        //System.out.println(AvgFemaleHeightDiff + " If your a female.");
        //System.out.println(AvgMaleHeightDiff + "If your a male.");      not accurate
        System.out.format("%.2fm if your male \n", AvgMaleHeightDiff);
        System.out.format("%.2fm if your female", AvgFemaleHeightDiff);

    }
}
