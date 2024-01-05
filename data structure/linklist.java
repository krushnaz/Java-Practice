class linklist{
    Node head;

   static class Node{
     int value;
     Node next;

     Node(int value){
        this.value = value;
        next = null;
     }

    }
    public static void main(String[] args) {
        linklist list = new linklist();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        
        //i am going to connect all the node into the specific order
        list.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        //printing the value of node
        System.out.println("LinkedList :");
        while(list.head != null){
            System.out.println(list.head.value+" ");
                list.head = list.head.next;
        }
    }
}