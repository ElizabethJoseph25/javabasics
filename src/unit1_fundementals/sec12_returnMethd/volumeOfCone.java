package unit1_fundementals.sec12_returnMethd;

public class volumeOfCone
{
    public static void main(String[] args) {
        System.out.println("Volume is: "+volume(3,4));
    }
    public static double volume(double r, double h)
    {
        return Math.PI*r*r*h;
    }
}
