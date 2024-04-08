import java.util.Scanner;

public class lengthOfLinkedList {
    public static class length {
        int data;
        length next;

        length(int data) {
            this.data = data;
        }
    }

    public static class l {
     public static  void disp(length head) {
            length temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

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
        l ob = new l();
        ob.disp(a);
    }
}
