package unit1_fundementals.sec12_returnMethd;

public class array
{
    public static void main(String[] args) {
        int[] array = new int[]{4,5,6,7,8};
        array = change(array);
        for (int ele:array) {
            System.out.println(ele);

        }

    }

    public static int[] change(int[] arr)
    {
        arr[0]=1;
        return arr;
    }
}
