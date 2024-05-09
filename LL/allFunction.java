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

        static void addAtBeg() {
            System.out.println("What Value you want to Insert");
            int data = sc.nextInt();
            makeNode newNode = new makeNode(data);

            if (head == null) {
                head = tail = newNode;
                return;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        static void addAtEnd() {
            System.out.println("What Value you want to Insert");
            int data = sc.nextInt();
            makeNode newNode = new makeNode(data);
            if (head == null) {
                head = tail = newNode;
                return;
            } else {
                tail.next = newNode;
                newNode = tail;
            }
        }

        static void addatMid() {

            System.out.println("What Value you want to Insert");
            int data = sc.nextInt();
            System.out.println("At which Position you want to Insert the Data ?");
            int pos = sc.nextInt();
            makeNode newNode = new makeNode(data);
            makeNode temp = head;
            if (head == null) {
                System.out.println("----------------------------------------------------");
                System.out.println("First Insert someting in the List");
                System.out.println("-------------------------------------------------");
                create();
                System.out.println("Insert Position and value in the List");
                addatMid();
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

        static int size() {
            int count = 0;
            makeNode temp = head;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }

        static void delAtMid() {
            if (head == null) {
                System.out.println("-------------------------");
                System.out.println("List is Empty");
                return;
            }
            System.out.println("Enter the Index Position");
            int pos = sc.nextInt();
            try {

                while (true) {
                    if (pos >= size()) {
                        System.out.println("Choose Correct Index");
                        pos = sc.nextInt(); // Update pos inside the loop
                    } else {
                        if (pos == 0) {
                            head = head.next;
                        } else {
                            makeNode temp = head;
                            for (int i = 0; i < pos - 1; i++) {
                                temp = temp.next;
                            }
                            temp.next = temp.next.next;
                        }
                        break; // Break the loop after performing the deletion
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();

            }

        }

        static void delAtEnd() {
            if (head == null) {
                return;
            }
            makeNode temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }

        public static void press() {
            System.out.println(
                    "Press 1: To Create List\nPress 2: Top Display List\nPress 3: To Insert value in the beginning\nPress 4: To Insert value in the Middle of the List\nPress 5: To Insert the Value in the Last of the List\nPress 6: To Delete the value from the Beginning\nPress 7: To Delete the value from the any Position of the List\nPress 8: To Delete the Value form the Last of the List");

            while (true) {
                System.out.println(
                        "Press Stop To stop Switching\nor\nPress 1: To Create List\nPress 2: Top Display List\nPress 3: To Insert value in the beginning\nPress 4: To Insert value in the Middle of the List\nPress 5: To Insert the Value in the Last of the List\nPress 6: To Delete the value from the Beginning\nPress 7: To Delete the value from the any Position of the List\nPress 8: To Delete the Value form the Last of the List");
                String choose = sc.nextLine();
                // sc.nextLine();
                if (choose.equalsIgnoreCase("Stop")) {
                    break;
                } else {
                    int state = Integer.parseInt(choose);
                    System.out.println(("--------------------------------------------------------"));
                    switch (state) {
                        case 1:
                            create();
                            disp();
                            break;
                        case 2:
                            disp();
                            break;
                        case 3:
                            addAtBeg();
                            sc.nextLine();
                            disp();
                            break;
                        case 4:
                            addatMid();
                            sc.nextLine();
                            disp();
                            break;
                        case 5:
                            addAtEnd();
                            sc.nextLine();
                            disp();
                            break;
                        case 6:
                            delAtBeg();
                            sc.nextLine();
                            disp();
                            break;
                        case 7:
                            delAtMid();
                            sc.nextLine();
                            disp();
                            break;
                        case 8:
                            delAtEnd();
                            sc.nextLine();
                            disp();
                            break;
                        default:
                            System.out.println("Invalid Case!!");
                            break;

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Linked ob = new Linked();
        ob.press();
    }
}
