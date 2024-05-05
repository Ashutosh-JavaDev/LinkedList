import java.util.Scanner;

public class allFunction {
    public static class makeNode {
        int data;
        makeNode next;

        makeNode(int data) {
            this.data = data;
        }
    }

    public static class Linked {
        makeNode head = null;
        makeNode tail = null;

        void disp() {
            makeNode temp = head;
            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        void create(int data){
            
        }
    }
}
