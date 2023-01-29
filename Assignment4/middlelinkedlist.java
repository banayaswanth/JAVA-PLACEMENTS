public class middlelinkedlist {

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
    }
    public int getLen()
    {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
    public void Middle()
    {
        if (head != null) {
            int length = getLen();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element : "
                             + temp.data );
            System.out.println();
        }
    }
 
    public static void main(String[] args)
    {
        middlelinkedlist yas = new middlelinkedlist();
        for (int i = 6; i >= 1; i--) {
            yas.push(i);
            
        }
        yas.print();
        yas.Middle();
    }
    
}
