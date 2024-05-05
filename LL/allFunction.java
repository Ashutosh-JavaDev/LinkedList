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
        Scanner sc = new Scanner(System.in);

        void disp() {
            makeNode temp = head;
            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        void create() {
            System.out.println("Press Double Enter to stop Inserting Value");
            while (true) {
                String str = sc.nextLine();
                if (str.equals(" ")) {
                    break;
                } else {
                    try {
                        int data=Integer.parseInt(str);
                        makeNode newNode = new makeNode(data);
                        if (head == null) {
                            newNode = head;
                        } else {
                            newNode.next = head;
                            head = newNode;
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Linked ob=new Linked();
        ob.create();
        ob.disp();
    }
}
