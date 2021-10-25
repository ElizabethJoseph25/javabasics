package unit1_fundementals.sec13_oops;

public class RectanleArea
{
    int height=1, width=1;
    private int radius=1;

    void printArea()
    {
        System.out.println(height*width);
    }

    void setRadius(int r)
    {
        radius=r;
    }


    void printCircle()
    {
        System.out.println(Math.PI*radius*radius);
    }
}
