import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public static Node insertInBeg(Node head) {
        Node newNode = new Node(10);
        newNode.next = head;
        return newNode;

    }
}

public class addinBeg {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node value=Node.insertInBeg(a);

        Node current=value;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }
}
