public class circularLinkedlist {
    Node tail;
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
          this.data = data;
          this.next = null;
        }
    }

    public void create(int data){
         Node newNode = new Node(data);
         Node tail = head;
         if(head == null){
           head = tail = newNode;
           tail.next = head;
         }else{
            Node current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;

         }
         
    }

    public void insertAtBig(int data){
        Node newNode = new Node(data);
        tail = head;
        if(head == null){
            tail = newNode;
            tail.next = newNode;
        }
        else{
              newNode.next = tail.next;
              tail.next = newNode;
        }
        System.out.println();
        System.out.println(tail.data);
        System.out.println(head.data);
    }


    public void printList(){
        Node temp = head;
        
        do{
          System.out.print(temp.data+" --> ");
          temp = temp.next;
        }while(temp != head);
      
       
    }
    public static void main(String[] args) {
        circularLinkedlist list = new circularLinkedlist();
        list.create(1);
        list.create(2);
        list.create(3);
        list.create(4);
        list.create(5);
        list.printList();
        list.insertAtBig(-1);
        list.printList();
    }
}
