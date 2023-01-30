public class removegivenlinkedlist {
    static Node head;
    static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void rem(int pos)
    {
        Node curr = head;
        if(pos==1)
        {
             head = curr.next;
        }
       else{
            for(int i=1;i<=pos-2&&curr!=null;i++)
            {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }
    public void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        removegivenlinkedlist yas = new removegivenlinkedlist();
        yas.head = new Node(3);
        yas.head.next = new Node(5);
        yas.head.next.next = new Node(8);
        yas.head.next.next.next = new Node(10);
        System.out.println("Before deleting : ");
        yas.print();
        int pos = 2;
        yas.rem(pos);
        System.out.println("After deleting : ");
        yas.print();
        
    }

}
