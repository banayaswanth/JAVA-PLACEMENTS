import java.util.*;
public class printelementsarraylist {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = sc.nextInt();
        ArrayList<String> yas = new ArrayList<String>(l);
        for(int i=0;i<l;i++)
        {
            yas.add(sc.next());
        }
        System.out.println(yas);
        sc.close();
    }
}
