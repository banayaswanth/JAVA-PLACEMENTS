public class looplinkedlist {
    static Node head; 
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    static public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static boolean detectLoop(Node h)
    {
        Node slow = h, fast = h;
        while (slow != null && fast != null&& fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        looplinkedlist yas = new looplinkedlist();
        yas.push(20);
        yas.push(4);
        yas.push(15);
        yas.push(10);
        yas.head.next.next.next.next = yas.head;
 
        if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }
}
