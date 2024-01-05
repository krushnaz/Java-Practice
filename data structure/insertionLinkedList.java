public class insertionLinkedList {
    Node head;
    class Node{
      int data;
      Node next;
      Node(int data){
        this.data = data;
       this.next = null;
      }
    }
    public void insertAtBig(int data){
        Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        
    }
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
        }else{
            while(temp.next != null){
                temp = temp.next;

            }
            temp.next = newNode;
        }
    }

    public void insertAtMid(int pos,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i=1;
        if(head == null){
           return;
        }
        else{
           while(i < pos){
              temp = temp.next;
              i++;
           }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("null");
      
    }
    public static void main(String[] args) {
        insertionLinkedList list = new insertionLinkedList();
        // list.insertAtBig(1);
        // list.insertAtLast(2);
        // list.insertAtBig(3);
        // list.insertAtLast(4);
        // list.insertAtMid(2, 5);
        // list.insertAtBig(1);
        // list.insertAtBig(5);
        // list.printList();
        list.insertAtLast(10);
        list.insertAtLast(10);
        list.insertAtLast(10);
        list.insertAtLast(10);
        list.insertAtLast(10);
        list.insertAtLast(10);
        list.printList();


    }
}
