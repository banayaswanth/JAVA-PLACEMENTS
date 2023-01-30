public class insertendlinkedlist {

    Node head;
    class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data)
    {
        if(head==null)
        {
            head = new Node(data);
        }
        else{
        Node new_node = new Node(data);
        Node curr = head;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = new_node;}
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
        insertendlinkedlist yas = new insertendlinkedlist();
        for (int i = 6; i >= 1; i--) {
            yas.push(i);
                        yas.print();
            
         }
        
    }
 
}
