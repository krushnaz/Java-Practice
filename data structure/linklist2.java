public class linklist2 {

    static class Node{
    int data;
    Node next;
     Node(int data){
        this.data = data;
       this.next = null;
     }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
          if(head == null){
            head = newNode;
            tail = newNode;

          }
          else{
            tail.next = newNode;
            tail = newNode;
          }
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }else{
            System.out.println("original list :");
            while(current != null){
                System.out.println(current.data+" ");
                current = current.next;
            }
            
          
        }

    }

    int countNode(){
        int count=0;
        Node currNode = head;
        while(currNode != null){
            count++;
            currNode = currNode.next;
        }
        return count;
    }
    public static void main(String[] args) {
        linklist2 list = new linklist2();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        list.display();
        System.out.println("the total number of node is :"+list.countNode());
    }
}
