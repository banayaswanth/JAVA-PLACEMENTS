public class insertbeginlinkedlist
{
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
        insertbeginlinkedlist yas = new insertbeginlinkedlist();
        for (int i = 6; i >= 1; i--) {
            yas.push(i);
            yas.print();
            
        }
        yas.print();
       
    }
   
}