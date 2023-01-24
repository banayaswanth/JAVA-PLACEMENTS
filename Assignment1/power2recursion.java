import java.util.Scanner;
public class power2recursion {
    public static int power(int yas)
    {
        if(yas==1)
        {
            return 2;
        }
        else
        {
            return 2*power(yas-1);
        }
    }
    public static void main(String[] args)
    {
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter Number : ");
              int yas = sc.nextInt();
              System.out.println(power(yas));
    }
    
}
