package LinkedList;

import java.util.Scanner;;

public class NthFromtheEnd {
    public static class nthEnd {
        int data;
        nthEnd next;

        nthEnd(int data) {
            this.data = data;
        }
    }

    public static class nthEndNode {
        public static void ending(nthEnd head, int index) {
            nthEnd fast = head;
            nthEnd slow = head;
            for (int i = 0; i < index; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println(slow.data);
        }
    }

    public static void main(String[] args) {
        nthEnd a = new nthEnd(1);
        nthEnd b = new nthEnd(12);

        nthEnd c = new nthEnd(13);

        nthEnd d = new nthEnd(14);

        nthEnd e = new nthEnd(15);
        nthEndNode ob=new nthEndNode();
        ob.ending(a, 3);
    }
}
