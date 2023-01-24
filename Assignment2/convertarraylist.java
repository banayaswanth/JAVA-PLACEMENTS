import java.util.*;
public class convertarraylist {
    public static void arraylist(int a[])
    {

        int l = a.length;
        ArrayList<Integer> yas = new ArrayList<Integer>(l);
        for(int i=0;i<l;i++)
        {
            yas.add(a[i]);
        }
        System.out.println(yas);
    }
    public static void main(String[] args)
    {
        int a[] = {12,45,65,1,4,78,89};
        arraylist(a);
    }
    
}
