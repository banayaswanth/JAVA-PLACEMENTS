public class sortlinkedlist {
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }   
    public Node head = null;  
    public Node tail = null;  
    public void add(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            tail.next = newNode; 
            tail = newNode;  
        }  
    }  
    public void sortList() { 
        Node current = head, index = null;  
        int temp;  
          
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null){ 
                index = current.next;  
                 while(index != null) {  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }      
        }  
    }  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
      
    public static void main(String[] args) {  
          
        sortlinkedlist yas = new sortlinkedlist();  
        yas.add(1);  
        yas.add(4);  
        yas.add(2);  
        yas.add(5);  
        yas.add(3);
        yas.add(6);  
        System.out.println("Before sorting  : ");  
        yas.display();  
        yas.sortList();    
        System.out.println("After sorting : ");  
        yas.display();  
    }  

}
