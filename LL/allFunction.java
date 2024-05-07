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

            if (head == null) {
                head = tail = newNode;
                return;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        static void addAtEnd(int data) {
            makeNode newNode = new makeNode(data);
            if (head == null) {
                head = tail = newNode;
                return;
            } else {
                tail.next = newNode;
                newNode = tail;
            }
        }

        static void addatMid(int pos, int data) {
            makeNode newNode = new makeNode(data);
            makeNode temp = head;
            if (head == null) {
                System.out.println("----------------------------------------------------");
                System.out.println("First Insert someting in the List");
                System.out.println("-------------------------------------------------");
                create();
                System.out.println("Insert Posiition and value in the List");
                addatMid(sc.nextInt(), sc.nextInt());
                System.out.println("---------------------------------------------------");
                return;
            } else {
                if (pos == 0) {
                    newNode.next = head;
                    head = newNode;
                    return;
                }
                for (int i = 0; i < pos - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        static void delAtBeg() {
            if (head == null) {
                System.out.println("-------------------------");
                System.out.println("List is Empty");
                return;
            } else {
                head = head.next;
            }
        }

        static void delAtMid(int pos) {
            if (head == null) {
                System.out.println("-------------------------");
                System.out.println("List is Empty");
                return;
            } else {
                makeNode temp = head;
                for (int i = 0; i < pos - 1; i++) {
                    temp = temp.next;
                }
                temp.next=temp.next.next;
            }
        }
    }

    public static void main(String[] args) {
        Linked ob = new Linked();
        ob.create();
        // ob.addAtBeg(0);
        // ob.addatMid(0, 15);
        ob.delAtMid(3);
        // ob.addAtEnd(6);
        ob.disp();
    }
}
