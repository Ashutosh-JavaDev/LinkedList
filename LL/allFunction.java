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
        static makeNode head = null;
        static makeNode tail = null;
        static Scanner sc = new Scanner(System.in);

        static void disp() {
            makeNode temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        static void create() {
            System.out.println("Enter Stop to stop Inserting Value");
            while (true) {
                String str = sc.nextLine();
                if (str.equalsIgnoreCase("stop")) {
                    break;
                } else {
                    try {
                        int data = Integer.parseInt(str);
                        makeNode newNode = new makeNode(data);
                        if (head == null) {
                            head = tail = newNode;
                        } else {
                            tail.next = newNode;
                            tail = newNode;
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        static void addAtBeg(int data) {
            makeNode newNode = new makeNode(data);
            makeNode temp = head;
            if (head == null) {
                newNode = head = tail;
                return;
            }
            temp = newNode.next;
            newNode = temp;
        }
    }

    public static void main(String[] args) {
        Linked ob = new Linked();
        ob.create();
        ob.addAtBeg(0);
        ob.disp();
    }
}
