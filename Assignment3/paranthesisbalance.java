import java.util.*;
public class paranthesisbalance {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paranthesis : ");
        String yas = sc.next();
        int count = 0;
        for(int i=0;i<yas.length();i++)
        {
             if(yas.charAt(i)=='(')
             {
                count++;
             }
             else{
                count--;
             }
        }
        if(count!=0)
        {
            System.out.println("Not Balanced");
        }
        else{
            System.out.println("Balanced");
        }
        sc.close();

    }
}
