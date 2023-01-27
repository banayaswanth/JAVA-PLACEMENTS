import java.util.*;
public class copyelements {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        
        ArrayList<Integer> yas = new ArrayList<Integer>(l);
        for(int i=0;i<l;i++)
        {
            yas.add(sc.nextInt());
        }
        System.out.println("Before copy : ");
        System.out.println(yas);
        ArrayList<Integer> sai = new ArrayList<Integer>(l);
        for(int i=0;i<l;i++)
        {
            sai.add(yas.get(i));
        }
        System.out.println("After copy : ");
        System.out.println(sai);
        sc.close();

    }
    
}
