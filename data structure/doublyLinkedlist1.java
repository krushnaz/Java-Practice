import javax.crypto.interfaces.PBEKey;

public class doublyLinkedlist1 {

    // linkedList
    // create
    // 1.insertion
    // insert at bigining
    // insert at middle
    // insert at last
    // 2.deletion
    // deletion at bigining
    // deletion at middle
    // deletion at last
    // 3.reverse

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void createList(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            newNode.prev = null;
        } else {

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
    }

    public void insertAtBig(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.prev = null;
        } else {
            Node temp = head;
            newNode.next = temp;
            temp.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("we cant insert , list is empty!!");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
            temp = newNode;

        }
    }

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);
        int i = 1;
        Node temp = head;
        // Node prevNode = head;
        while (i < pos-1) {

            temp = temp.next;
            i++;
        }
        newNode.prev = temp.prev;
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteAtBig(){
        if(head == null){
            System.out.println("list is empty!!");
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtEnd(){
        if(head == null){
            System.out.println("list empty!!");
        }else{
            Node temp = head;
            Node prevNode = head;
            while(temp.next != null){
                prevNode  = temp;
                temp = temp.next;
            }
           prevNode.next = null;
        }
    }

    public void deleteAtpos(int pos){
        if(head == null){
            System.out.println("list empty!!");
        }else{
            int i = 0;
            Node temp = head;
            while(i < pos-1){
                temp = temp.next;
                i++;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev.next;

        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublyLinkedlist1 list = new doublyLinkedlist1();
        list.createList(1);
        list.createList(2);
        list.createList(3);
        list.createList(4);
        list.createList(5);
        list.printList();
        list.insertAtBig(0);
        list.printList();
        list.insertAtEnd(6);
        list.printList();
        list.insertAtPos(10, 3);
        list.printList();
        list.deleteAtBig();
        list.printList();
        list.deleteAtEnd();
        list.printList();
        list.deleteAtpos(4);
        list.printList();

    }
}
