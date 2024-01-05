public class circularLinkedlist1 {
    Node head;
    Node temp ;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void createList(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
            temp = head;
        }else{
            temp.next = newNode;
            newNode.next = head;
            temp = newNode;
        }
    }

     public void insertAtBig(int data){
        Node newNode = new Node(data);
        Node tail = head;
        if(head == null){
            head = newNode;
            newNode.next = head;
        }else{
            while(tail.next != head){
                tail = tail.next;
            }
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
     }

     public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
        }else{
            Node tail = head;
            while(tail.next != head){
                tail = tail.next;
            }
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;

        }
     }
public void insertAtPos(int data,int pos){
    Node newNode = new Node(data);
    Node current = head;
    int i = 1;

    if(head == null){
        head = newNode;
        newNode.next = head;
    }else{

        while(i < pos){
         
            current = current.next;
            i++;

        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
}
    public void printList(){
        if(head == null){
            System.out.println("list is empty!!");
        }
        else{
            Node temp = head;
        
            do{
              System.out.print(temp.data+" --> ");
              temp = temp.next;
            }while(temp != head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        circularLinkedlist1 list = new circularLinkedlist1();
        list.createList(1);
        list.createList(2);
        list.createList(3);
        list.createList(4);
        list.createList(5);
        list.printList();
        list.insertAtBig(-1);
        list.printList();
        list.insertAtEnd(6);
        list.printList();
        list.insertAtPos(10, 4);
        list.printList();

    }
}
