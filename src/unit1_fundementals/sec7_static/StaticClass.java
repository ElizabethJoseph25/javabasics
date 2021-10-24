package unit1_fundementals.sec7_static;

public class StaticClass
{
        static int x = 5;

        public static void main(String[] args)
        {
            System.out.println(x);
            foo();
            bar();

        }
        public static void foo()
        {
            System.out.println(x);
            x=10;
        }
        public static void bar()

        {
            System.out.println(x);
        }


}
