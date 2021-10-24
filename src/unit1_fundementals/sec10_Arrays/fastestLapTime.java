package unit1_fundementals.sec10_Arrays;
import java.util.Scanner;

public class fastestLapTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of laps: ");
        int lapNum = input.nextInt();
        double[] Laptime = new double[lapNum];
        System.out.println("Enter the laptimes: ");
        for (int i = 0; i < lapNum; i++) {
            Laptime[i] = input.nextDouble();
        }

        double fastest = Laptime[0];
        for (int i = 0; i < lapNum; i++) {
            if (fastest < Laptime[i]) {
                fastest = Laptime[i];
            }
        }

        System.out.println("fastest one is: " + fastest);
    }
};



