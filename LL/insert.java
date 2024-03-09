package ArrayList_Program;
import java.util.Scanner;

class Node {
    int Data;
    Node next;

    Node(int Data) {
        this.Data = Data;
        this.next = null;
    }
}

public class insert {
    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(13);
        Node c=new Node(14);
        Node d=new Node(15);
        Node e=new Node(17);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        
        Node current=a;
        while(current!=null){
            System.out.print(current.Data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
