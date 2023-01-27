import java.util.*;
public class reversestack {
    public static void insertBottom(Stack<Integer> S,int sai)
    {
           if(S.empty())
           {
            S.push(sai);
            return ;
           }
           int top = S.pop();
           insertBottom(S,sai);
           S.push(top);
    }
    public static void reverse(Stack<Integer> S)
    {
          if(S.empty())
          {
            return ;
          }
          int sai = S.pop();
          reverse(S);
          insertBottom(S,sai);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of stack : ");
        int l = sc.nextInt();
        Stack<Integer> yas = new Stack<>();
        for(int i=0;i<l;i++)
        {
            yas.push(sc.nextInt());
        }

        System.out.println("Before reverse : " + yas);
        reverse(yas);
        System.out.println("After reverse : " + yas);
        sc.close();

    }
}
