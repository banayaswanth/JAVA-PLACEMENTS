import java.util.Scanner;
public class countrecursive {
    public static int recursive(int count)
    {
            if(count>0)
            {
                System.out.println(count);
                return recursive(count-1);
            }
            else
            {
                return 0;
            }
            
    }
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Number : ");
         int yas = sc.nextInt();
         recursive(yas);

    }
}
