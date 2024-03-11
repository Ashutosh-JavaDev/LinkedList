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
            System.out.println("Press 'Stop' for stop adding the Number in list");

            String str;
            while (true) {
                str = sc.nextLine();
                if (str.equalsIgnoreCase("stop")) {
                    break;
                } else {
                    try {
                        int data = Integer.parseInt(str);// this helps to convert the String into integer;
                        singly newN = new singly(data);
                        if (head == null) {
                            head = tail = newN;
                        }

                        else {
                            tail.next = newN;
                            tail = newN;
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Number, or press Stop to stop  adding number");
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

        void displayInrev(singly head) {
            if (head == null) {
                return;
            } else {
                displayInrev(head.next);
                System.out.print(head.data + " ");
            }
            // System.out.println();
        }

        int size() {
            singly current = head;
            int count = 0;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        void insertAtBeggining(int val) {
            singly newN = new singly(val);
            if (head == null) {
                head = tail = newN;
            } else {
                newN.next = head;
                head = newN;
            }
        }

        void insertAtEnd(int data) {
            singly newN = new singly(data);
            if (head == null) {
                head = tail = newN;
            } else {
                tail.next = newN;
                tail = newN;
            }
        }

        void insertAtRef(int index, int data) {
            if (index == size()) {
                insertAtEnd(data);
            }
            singly newN = new singly(data);
            singly temp = head;
            for (int i = 0; i <= index; i++) {
                temp = temp.next;
            }
            newN.next = temp.next;
            temp.next = newN;
        }

        int search(int data) {
            singly temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.data == data) {
                    return index;
                }
                temp = temp.next;
                index++;
            }
            return-1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        meathod ob = new meathod();
        ob.create();
        // System.out.println("Linked List :");
        // ob.display();
        // System.out.println("Linked List In Reverse Order: ");
        // ob.displayInrev(ob.head);
        // System.out.println();
        // System.out.println("Size of Node: " + ob.size());
        // System.out.print("Enter the Number want to add at Beggining: ");
        // ob.insertAtBeggining(sc.nextInt());
        // System.out.println("Linked list After Update: ");
        // ob.display();
        // System.out.print("Enter the Number want to add at End : ");
        // ob.insertAtEnd(sc.nextInt());
        // System.out.println("Linked list After Update: ");
        // ob.display();
        // System.out.print("Enter the Index where you want to add number: ");
        // int index=sc.nextInt();
        // System.out.println("Enter the Number: ");
        // ob.insertAtRef(index, sc.nextInt());
        // System.out.println("Updated Linked List");
        ob.display();
       int output= ob.search(sc.nextInt());
       System.out.println("Element found at: "+output);
        System.out.println(ob.tail.data);
    }
}
