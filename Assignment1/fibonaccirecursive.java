import java.util.Scanner;
public class fibonaccirecursive
{
    public static int fib(int yas)
    {
        if(yas==1 || yas==2)
        {
              return 1;
        }
        else
        {
            return fib(yas-1)+fib(yas-2);
        }
    }

    public static void main(String[] args)
    {
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter Number : ");
              int yas = sc.nextInt();
              System.out.println(fib(yas));
    }
}