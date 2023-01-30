public class searchlinkedlist {
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
    public void search(int data)
    {
        Node curr = head;
        int count = 0;
        while(curr!=null){
        if(curr.data == data )
        {
            System.out.println(count);
            break;
        }
        else{
            count++;
            curr=curr.next;
        }
    }
    if(curr==null){
    System.out.println("not found");}

    }
    public void push(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
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
        searchlinkedlist yas = new searchlinkedlist();
        yas.head = new Node(10);
        yas.head.next = new Node(20);
        yas.head.next.next = new Node(30);
        yas.head.next.next.next = new Node(12);
        yas.head.next.next.next.next = new Node(0);
        yas.head.next.next.next.next.next = new Node(23);
        yas.head.next.next.next.next.next.next = new Node(2);
        yas.search(2);

        
    }
 
}
