public class revserseLinkedlist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertion(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

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

    public void printList() {
        Node temp = head;
        if (head == null) {
            System.out.println("list is empty!");
        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        revserseLinkedlist list = new revserseLinkedlist();
        list.insertion(1);
        list.insertion(2);
        list.insertion(3);
        list.insertion(4);
        list.insertion(5);
        list.insertion(6);
        System.out.println("normal linkedlist: ");
        list.printList();
        System.out.println("reversing the list :");
        list.reverseList();
        list.printList();

    }
}
