package LinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
    public static class singly {
        int data;
        singly next;

        singly(int data) {
            this.data = data;
        }
    }

    public static class meathod {
        singly head = null;
        singly tail = null;
        Scanner sc = new Scanner(System.in);

        void create(int data) {
            singly newN = new singly(data);
            if (head == null) {
                head = tail = newN;
            } else {
                tail.next = newN;
                tail = newN;
            }
        }

        void display() {
            singly cure = head;
            while (cure != null) {
                System.out.print(cure.data + " ");
                cure = cure.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        meathod ob = new meathod();
        ob.create(1);
        ob.create(2);
        ob.create(3);
        ob.display();
    }
}
