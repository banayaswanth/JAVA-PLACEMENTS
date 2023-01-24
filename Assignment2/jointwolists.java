import java.util.*;
public class jointwolists {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length for first arraylist : ");
        int l = sc.nextInt();
        ArrayList<Integer> yas = new ArrayList<Integer>(l);
        for(int i=0;i<l;i++)
        {
            yas.add(sc.nextInt());
        }
        System.out.println(yas);
        
        System.out.print("Enter length for second arraylist : ");
        int g = sc.nextInt();
        ArrayList<Integer> sai = new ArrayList<Integer>(g);
        for(int i=0;i<g;i++)
        {
               sai.add(sc.nextInt());
        }
        yas.addAll(sai);
        System.out.println("After joining : ");
        System.out.println(yas);
        sc.close();

    }
    
}
