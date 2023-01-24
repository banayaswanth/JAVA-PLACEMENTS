// import java.util.Scanner;
// public class sumrecursion
// {
//     public static int sum(int yas)
//     {
//         if(yas>0)
//             return yas+sum(yas-1);
//         return 0;
//     }
//     public static void main(String[] args)
//     {
//               Scanner sc = new Scanner(System.in);
//               System.out.print("Enter Number : ");
//               int yas = sc.nextInt();
//               System.out.println(sum(yas));
//     }
// }




import java.util.Scanner;
public class sumrecursion
{
    public static void main(String[] args)
    {
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter Number : ");
              int yas = sc.nextInt();
              int sum=0;
              for(int i=1;i<=yas;i++)
              {
                sum=sum+i;
              }
              System.out.println(sum);

    }
}