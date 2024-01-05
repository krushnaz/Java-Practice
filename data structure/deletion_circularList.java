class deletion_circularList{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
       
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    public void addNode(int value) {
        Node newNode = new Node(value);
    
        if (head == null) {
           head = tail = newNode;
           tail.next = head;
        } else {
            Node current=head;
           while(current.next != head){
                current = current.next;
           }
           current.next = newNode;
           newNode.next = head;
        }
    
        tail = newNode;
        tail.next = head;
    }

    public void deletionAtBig(){
      
       if(head == null){
        System.out.println("empty!!");
       }else{
          if(head != tail)
          {
            head = head.next;
            tail.next = head;
          }else{
            head = tail = null;
          }

       }
    }

    public void reverse(){
        Node current,prev,nextNode;
        current = tail.next;
        nextNode = current.next;
        if(tail == null){
            System.out.println("list is empty!!");
        }else{
            while(current != tail){
                prev  = current;
                nextNode = current.next;
                current.next = prev;
            }
            nextNode.next = tail;
            tail = nextNode;
        }
    }

    public void printList(){
      
        Node temp = head;
        
        do{
          System.out.print(temp.data+" --> ");
          temp = temp.next;
        }while(temp != tail.next);
        System.out.println();
    }

    public static void main(String[] args) {
        deletion_circularList list = new deletion_circularList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.printList();
        // list.deletionAtBig();
        // list.printList();
        list.reverse();
        list.printList();
    }
}