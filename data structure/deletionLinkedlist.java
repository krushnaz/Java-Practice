public class deletionLinkedlist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public void insert(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteAtBig(){
        if(head == null){
            System.out.println("list is already empty!");
        }
        else{
            head = head.next;
        }
    }

    public void deleteAtLast(){
        Node temp = head;
        Node prev = head;
        while(temp.next != null ){
           prev = temp;
           temp = temp.next;
        }
        prev.next = null;
    }
    
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        deletionLinkedlist list = new deletionLinkedlist();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.printList();
        System.out.println();
        list.deleteAtBig();
        list.deleteAtLast();
        list.printList();
    } 
}
