
import java.util.Scanner;

class Nodes {
    int Data;
    Nodes next;

    Nodes(int Data) {
        this.Data = Data;
        this.next = null;
    }
}

public class Adding {
    public static void main(String[] args) {
        Nodes a=new Nodes(12);
        Nodes b=new Nodes(13);
        Nodes c=new Nodes(14);
        Nodes d=new Nodes(15);
        Nodes e=new Nodes(17);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        
        Nodes current=a;
        while(current!=null){
            System.out.print(current.Data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
