import java.util.Scanner;

public class linkedlist1 {
     //linkedList
       //create
      // 1.insertion
         // insert at bigining
         // insert at middle
         // insert at last
      // 2.deletion
          // deletion at bigining
         // deletion at middle
         // deletion at last
      // 3.reverse
    int len = 1;
     Node head = null;
     Node temp = null;
   static class Node{
        int data;
        Node next;
          Node(int data){
            this.data = data;
            this.next = null;
        }
     }
      
     public void createList(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            temp = newNode;
        }
        else{

            temp.next = newNode;
            temp = newNode;
        }
       
     }

     public void insertAtBig(int data){
      Node newNode = new Node(data);
      if(head == null){
         head = newNode;
      }else{
         newNode.next = head;
         head = newNode;
      }
     }
     
     public void insertAtEnd(int data){
      Node newNode = new Node(data);
      if(head == null){
         head = newNode;
      }else{
         Node tail = head;
         while(tail.next != null){
            tail = tail.next;
         }
         tail.next = newNode;
         tail = newNode;
      }
     }

     public int count(){
      int count = 1;
      Node current = head;
      while(current != null){
         count++;
         current = current.next;
      }
      return count;
     }
     
     public void insertAtPos(int data,int pos){
       Node newNode = new Node(data);
       int i=1;
       if(pos == 1){
         insertAtBig(data);
       }
       else if(pos > count()){
         System.out.println("invalid position it is not posible to perform this task!!");
       }
       else{
         Node current = head;
         while(i < pos-1){
            current = current.next;
            i++;
         }
          newNode.next = current.next;
          current.next = newNode;
       }
     }

   //   -----------------------------------------------------------------------------------------------------
   // deletion operation starts

   // 1.delete At Bigining

   public void deleteAtBig(){
      if(head == null){
         System.out.println("list is empty!!");
      }else{
         head = head.next;
      }
   }


     // 2.delete At End
     public void deleteAtEnd(){
      if(head == null){
         System.out.println("list is empty!!");
      }else{
         Node temp = head;
         Node prevNode = head;
         
         while(temp.next != null){
            prevNode = temp;
            temp = temp.next;
         }
         prevNode.next = null;
         
      }
     }

     // 3.delete at position
     public void deleteAtPos(int pos){
      Node temp = head;
      Node prevNode = temp;
      int i = 1;
      if(head == null){
         System.out.println("list is empty!!");
      }else if(pos == 1){
         deleteAtBig();
      }else{
         while(i < pos){
            prevNode = temp;
            temp = temp.next;
            i++;
         }
         prevNode.next = temp.next;

         // System.out.println("prev = "+prevNode.data);
         // System.out.println("temp = "+temp.data);

      }
     }

     //------------------------------------------------------------------------------
     //reverse linkedlist
     public void reverseList() {
      if (head == null) {
          System.out.println("list is empty we can't reverse....");
      } else {
          Node prevNode = null;
          Node currentNode;
          Node nextNode;
          currentNode = nextNode = head;
          while (nextNode != null) {
              nextNode = nextNode.next;
              currentNode.next = prevNode;
              prevNode = currentNode;
              currentNode = nextNode;
          }
          head = prevNode;
      }
  }
      
     public void printlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
            
        }
        System.out.println("null");
     }


   

      public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();
      //   list.createList(1);
      //   list.createList(2);
      //   list.createList(3);
      //   list.createList(4);
      //   list.createList(5);
      //   list.printlist();
      //   list.insertAtBig(0);
      //   list.printlist();
      //   list.insertAtEnd(6);
      //   list.printlist();
      //   list.insertAtPos(10, 2);
      //   list.printlist();
      //   list.deleteAtBig();
      //   list.printlist();
      //   list.deleteAtEnd();
      //   list.printlist();
      //   list.deleteAtPos(4);
      //   list.printlist();
      //   list.reverseList();
      //   list.printlist();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("1. CREATE LIST");
         System.out.println("2. INSERT AT BIGINING");
         System.out.println("3. INSERT AT END");
         System.out.println("4. INSERT AT POSITION");
         System.out.println("5. DELETE AT BIGINING ");
         System.out.println("6. DELETE AT LAST");
         System.out.println("7. DELETE AT POSITION");
         System.out.println("8.  REVERSE LIST");
         System.out.println("9.  PRINT LAST");
         System.out.println("10. EXIT");

         System.out.println();
         System.out.println("enter your choice : ");
         int choice = sc.nextInt();
         int data;
         int pos;
         switch(choice){
            case 1 :
            System.out.println("enter data to create list :");
             data = sc.nextInt();
            list.createList(data);
            break;

            case 2 :
            System.out.println("enter data to insert at bigining :");
             data = sc.nextInt();
            list.insertAtBig(data);
            break;

            case 3 :
            System.out.println("enter data to insert at last :");
            data = sc.nextInt();
            list.insertAtEnd(data);
            break;

            case 4 :
            System.out.println("enter data to insert at position :");
            data = sc.nextInt();
            System.out.println("enter position :");
            pos = sc.nextInt();
            list.insertAtPos(data, pos);
            break;
         
            case 5 :
            list.deleteAtBig();
            System.out.println("you have delete at bigining :");
            break;

            case 6 :
            list.deleteAtEnd();
            System.out.println("you have delete at end :");
            break;

            case 7 :
           
            System.out.println("enter position :");
            pos = sc.nextInt();
            list.deleteAtPos(pos);
            System.out.println("you have deleted at the position :");
            break;

            case 8 :
            System.out.println("your original list is :");
            list.printlist();
            System.out.println("your reverse list is :");
            list.reverseList();
            break;

            case 9 :
            System.out.println("your list is :");
            list.printlist();
            break;
            
            case 10 :
            System.out.println("you are exit...!!!");
            System.exit(0);
            break;

            default :
            System.out.println("enter a valid choice");
            break;
         }


      }
        
      }
}
