import java.util.*;
public class reversesortremovearralist {
              
         public static void main(String[] args)
         {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length : ");
            int l =sc.nextInt();
            ArrayList<Integer> yas = new ArrayList<Integer>(l);
            for(int i=0;i<l;i++)
            {
                yas.add(sc.nextInt());
            }
            ArrayList<Integer> sai = new ArrayList<Integer>(l);
            for(int i=l-1;i>=0;i--)
            {
                sai.add(yas.get(i));
            }
            System.out.println("after reverse : ");
            System.out.println(sai);
            Collections.sort(yas);
            System.out.println("After sorting : ");
            System.out.println(yas);
            System.out.print("Enter the element to delete : ");
            int r = sc.nextInt();
            int index=-1;
            for(int i=0;i<l;i++)
            {
                if(yas.get(i)==r)
                {
                    index=i;
                    break;
                }
                
            }
            if(index!=-1){
            yas.remove(index);
           
            }
            System.out.println(yas);

            sc.close();
            
         }
}
