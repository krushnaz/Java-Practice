public class linklist3 {
    Node head;
    static class Node{
        int data;
        Node next;
          Node(int data){
             this.data = data;
             this.next = null;
          }
    }
    public void insertHead(int value){
        // Node newNode = new Node(value);
        if(head == null){
          head = new Node(value);
        }
    }
  

    public void insertAfter(int key, int value){
        Node newNode = new Node(value);
        if(key == head.data){
            newNode.next = head.next;
            head.next = newNode.next;
            return;
        }
        Node temp = head;
        while(temp.data != key){
            temp = temp.next;
            if(temp == null){
                return;
            }
            newNode = temp.next;
            temp.next = newNode;
        }
       
    }

    public void insertTail(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = newNode;
    }

   
    public void printList(){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.data+" -->");
           temp = temp.next;
        }
        System.out.print("null");
    }

    public void deleteNode(int key){
          Node temp = head, prev = null;
          if(temp != null &&  temp.data == key){
            head = temp.next;
            return;
          } 
          while(temp != null && temp.data != key){
           prev = temp;
           temp = temp.next;
            
          }
          if(temp == null){
            return;
        }
        prev.next = temp.next;
    }
    public static void main(String[] args) {
        linklist3 list = new linklist3();
       list.insertHead(1);
      
        System.out.print("After insertion at head: ");
        list.printList();
        System.out.println();
  
        list.insertTail(4);
        list.insertTail(5);
        list.insertTail(6);
        list.insertTail(7);
        list.insertTail(8);
        list.insertTail(9);
        System.out.print("After insertion at tail: ");
        list.printList();
        System.out.println();
  
        list.insertAfter(1, 2);
        list.insertAfter(5, 6);
        System.out.print(
            "After insertion at a given position: ");
        list.printList();
        System.out.println();
        System.out.print("After deletion: ");

      list.deleteNode( 1);
        list.printList();

      
    }
}
