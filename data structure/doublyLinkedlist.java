import java.util.Scanner;

public class doublyLinkedlist {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
       
        Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
        
        }
    }

    void create(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;

        }else{
            while(temp.next != null){
               temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        System.out.println("you have inserted :"+data);
    }

   

    public void insertAtBig(int data){
        Node newNode = new Node(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        System.out.println("you have inserted :"+data);
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        System.out.println("you have inserted :"+data);
    }

    public void insertBeforePos(int data,int pos){
        Node newNode = new Node(data);
        Node temp = head;
        int i=1;
        while(i < pos-1){
            temp = temp.next;
            i++;
        }
        newNode.prev = temp.prev;
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("you have inserted :"+data);
    }

    public void insertAtAfterPos(int data,int pos){
        Node newNode = new Node(data);
        Node temp = head;
        int i=1;
        while(i < pos){
            temp = temp.next;
            i++;
        }
        newNode.prev = temp.prev;
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("you have inserted :"+data);

    }

    public void deleteAtBigining(){
        if(head == null){
            System.out.println("list is empty!!");
       }
        head = head.next;
    }

    public void deleteAtEnd(){
        Node temp = head;
        Node prev = head;
        if(head == null){
             System.out.println("list is empty!!");
        }
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }


   void deleteAtPos(int pos){
    Node temp =head;
    int i=1;
    if(pos == 1){
      deleteAtBigining();
    }
    while(i < pos){
        temp = temp.next;
        i++;
    }
    // System.out.println("position is :"+temp.data);
       temp.prev.next = temp.next;
       temp.next.prev = temp.prev;
    
   }
 
   public void reverse() {
    Node current = head;
    Node temp = null;
    
    while (current != null) {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;
    }
    
    if (temp != null) {
        head = temp.prev;
    } else {
        head = current;
    }
}


    void printList(){
        if(head == null){
            System.out.println("list is empty!!");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        doublyLinkedlist list = new doublyLinkedlist();
        list.create(1);
        list.create(2);
        list.create(3);
        list.create(4);
        list.create(5);
        list.create(6);
        // list.insertAtBig(-1);
        // list.insertAtEnd(7);
        // list.insertBeforePos(10, 3);
        // list.insertBeforePos(20, 3);
        // list.deleteAtBigining();
        // list.deleteAtEnd();
        // list.deleteAtPos(4);
        list.printList();
        System.out.println("after revserse :");
        list.reverse();
        list.printList();


        // Scanner sc = new Scanner(System.in);
        // int choice;
        // while(true){
        //     System.out.println();
        //     System.out.println("1.create the linkedlist ");
        //     System.out.println("2.insert at bigining");
        //     System.out.println("3.insert at end");
        //     System.out.println("4.insert at before position");
        //     System.out.println("5.insert at after position");
        //     System.out.println("6.print linkedlist");
        //     System.out.println("7.exit!");
        //     System.out.println();
        //     System.out.println("enter your choice:");
        //     choice = sc.nextInt();
        //     int value;
        //     int pos;
        //     switch(choice){
        //         case 1 :
        //         System.out.println("insert element :");
        //         value = sc.nextInt();
        //         list.create(value);
        //         break;

        //         case 2 :
        //         System.out.println("enter a element :");
        //         value = sc.nextInt();
        //         list.insertAtBig(value);
        //         break;

        //         case 3 :
        //         System.out.println("enter a element :");
        //         value = sc.nextInt();
        //         list.insertAtEnd(value);
        //         break;

        //         case 4 :
        //         System.out.println("enter a element :");
        //         value = sc.nextInt();
        //         System.out.println("enter a position :");
        //         pos = sc.nextInt();
        //         list.insertBeforePos(pos, value);
        //         break;
                
        //         case 5 :
        //         System.out.println("enter a element :");
        //         value = sc.nextInt();
        //         System.out.println("enter a position :");
        //         pos = sc.nextInt();
        //         list.insertBeforePos(pos, value);
        //         break;
                
        //         case 6 :
        //         list.printList();
        //         break;

        //         case 7 :
        //         System.out.println("do you want to exit! [yes/no]");
        //         String option = sc.next();
        //         if(option.equalsIgnoreCase("yes")){
        //             System.exit(0);
        //         }
        //     }
        // }

    }
}
