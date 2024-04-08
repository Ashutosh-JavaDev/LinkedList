import java.util.Scanner;

class length {
    int data;
    length next;

    length(int value) {
        this.data = data;
    }

    public static void disp(length head) {
        length temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class lengthOfLinkedList {
    public static void main(String[] args) {
        length a = new length(1);
        length b = new length(4);
        length c = new length(3);
        length d = new length(5);
        length e = new length(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        length ob = new length(0);
        ob.disp(a);
    }
}
