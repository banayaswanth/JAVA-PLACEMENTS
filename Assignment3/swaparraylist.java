import java.util.*;
public class swaparraylist {
    public static void main(String[] args)
    {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter first index to swap : ");
             int i = sc.nextInt();
             System.out.print("Enter second index to swap : ");
             int j = sc.nextInt();
             ArrayList<Integer> yas = new ArrayList<Integer>();
             yas.add(0,12);
             yas.add(1,45);
             yas.add(2,89);
             yas.add(3,25);
             yas.add(4,3);
             System.out.println("Before Swapping : " + yas);
             Collections.swap(yas,i-1,j-1);
             System.out.println("After Swapping : " + yas);
             sc.close();
    }
    
}
