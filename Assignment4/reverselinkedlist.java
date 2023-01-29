public class reverselinkedlist {
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
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        reverselinkedlist yas = new reverselinkedlist();
        yas.head = new Node(1);
        yas.head.next = new Node(2);
        yas.head.next.next = new Node(3);
        yas.head.next.next.next = new Node(4);
        yas.head.next.next.next.next = new Node(5);
        yas.head.next.next.next.next.next = new Node(6);
        System.out.println("Before reverse : ");
        yas.printList(head);
        System.out.println();
        head = yas.reverse(head);
        System.out.println("After reverse : ");
        yas.printList(head);
    }
}
