import java.util.*;
public class duplicatearraylist {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter length of arraylist : ");
        int l = sc.nextInt();
        ArrayList<Integer> yas = new ArrayList<Integer>(l);
        for(int i=0;i<l;i++)
        {
            yas.add(sc.nextInt());
        }
        int inde = -1;
        System.out.print("Enter element to get index : ");
        int el = sc.nextInt();
        for(int i=0;i<l;i++)
        {
            if(yas.get(i)==el)
            {
                inde = i;
                break;
            }
            
        }
        if(inde!=-1)
        {
            System.out.print("Index of searched element from begining : ");
            System.out.println(inde);
           
        }
        int sai = -1;
        for(int i=l-1;i>inde;i--)
        {
            if(yas.get(i)==el)
            {
                 sai =i;
                 break;
            }
        }
        if(sai!=-1)
        {
            System.out.print("Index of searched element from end : ");
            System.out.println(sai);
        }
        else{
            System.out.println("Element is not present ");
        }
        sc.close();

    }
    
}
