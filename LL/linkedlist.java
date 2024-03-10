import java.util.Scanner;

public class linkedlist {
    public static class listing {
        int data;
        listing next;

        listing(int data) {
            this.data = data;
        }

    }

    public static class list {
        listing head = null;
        listing tail = null;

        void InsertatBeg(int data) {
            listing newN = new listing(data);
            if (head == null) {
                head = tail = newN;
            } else {
                newN.next = head;
                head = newN;
            }
        }

        void display() {
            listing temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtEnd(int data) {
            listing newN = new listing(data);
            if (head == null) {
                head = tail = newN;
            } else {
                listing temp = head;
                if (temp != null) {
                    temp = temp.next;
                    if (temp == null) {
                        newN.next = tail;
                    }
                    else{
                        temp=temp.next;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        list ll = new list();
        ll.InsertatBeg(1);
        ll.InsertatBeg(12);
        ll.InsertatBeg(15);
        ll.display();
    }
}
