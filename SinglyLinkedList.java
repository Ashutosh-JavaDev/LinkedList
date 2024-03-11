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

        void create() {
            String str;
            while (true) {
                System.out.println("Press 'Stop' for stop adding the Number in list");
                str = sc.nextLine();
                if (str.equalsIgnoreCase("stop")) {
                    break;
                } else {
                    try {
                        int data = Integer.parseInt(str);
                        singly newN = new singly(data);
                        if (head == null) {
                            head = tail = newN;
                        }

                        else {
                            tail.next=newN;
                            tail=newN;
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Number, or prress Stop to stop  adding number");
                    }
                }

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
        Scanner sc = new Scanner(System.in);
        meathod ob = new meathod();

        ob.display();
    }
}
