public class doublyCircularlist {
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

    public void createList(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }
      

    public void insertAtBig(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            head.next = head;
            head.prev = head;
        }else{
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertAtBig(data);
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }
     
     
    public void insertAtPos(int data,int pos){
        Node newNode = new Node(data);
        int i=1;
        Node temp = head;
        if(head == null){
            insertAtBig(data);
        }else if(i > pos){
           System.out.println("invalid position");
        }else{
            while(i < pos-1){
               temp = temp.next;
               i++;
            }
            newNode.prev = temp;
            newNode.next  =temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // deletion at bigining

    public void deletionAtBig(){
        if(head == null){
            System.out.println("list is empty!!");
        }else if(head.next == head){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }
    
//deletion at end
    public void deletionAtEnd(){
        if(head == null){
            System.out.println("list is empty!!");
        }else{
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }
//deletion at position
    public void deletionAtPos(int pos){
        Node temp = head;
        int i=1;
        while(i < pos){
            temp = temp.next;
            i++;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        if(temp.next == head){
            tail = temp.prev;
        }

    }
    // public void printList(){
    //     Node temp = head;
    //     while(temp != tail){
    //         System.out.print(temp.data+" --> ");
    //         temp = temp.next;
    //     }
    //     System.out.println(temp.data);
    // }

        public void printList(){
        Node temp = head;
        do{
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        while(temp != tail.next);
        System.out.println();
    }
    public static void main(String[] args) {
        doublyCircularlist list = new doublyCircularlist();
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
        list.deletionAtBig();
        list.printList();
        list.deletionAtEnd();
        list.printList();
        list.deletionAtPos(4);
        list.printList();

    }
}
