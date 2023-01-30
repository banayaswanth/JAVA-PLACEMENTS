public class insertgivenlinkedlist {
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
    public void push(int data,int pos)
    {
        Node temp = new Node(data);
        Node curr = head;
        if(pos==1)
        {
             temp.next = head;  
        }
       else{
            for(int i=1;i<=pos-2;i++)
            {
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
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
        insertgivenlinkedlist yas = new insertgivenlinkedlist();
        yas.head = new Node(3);
        yas.head.next = new Node(5);
        yas.head.next.next = new Node(8);
        yas.head.next.next.next = new Node(10);
        System.out.println("Before inserting : ");
        yas.print();
        int pos = 2;
        yas.push(2,pos);
        System.out.println("After inserting : ");
        yas.print();
        
    }

}
