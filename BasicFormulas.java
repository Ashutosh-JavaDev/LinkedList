package LinkedList;

import java.util.Scanner;

public class BasicFormulas {
    public static class noding {
        int data;
        noding next;

        noding(int data) {
            this.data = data;
        }
    }

    public static class listing {
        noding head = null;
        noding tail = null;
        Scanner sc = new Scanner(System.in);

        void create() {
            System.out.println("Press Stop to stop inserting Data");
            String str;
            while (true) {
                str = sc.nextLine();
                if (str.equalsIgnoreCase("Stop")) {
                    break;
                } else {
                    try {
                        int data = Integer.parseInt(str);
                        noding newN = new noding(data);
                        if (head == null) {
                            head = tail = newN;
                        } else {
                            tail.next = newN;
                            tail = newN;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Input\nPress Stop or insert adding Number");
                    }
                }
            }
        }

        void disp() {
            noding current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        int counnt() {
            noding current = head;
            int c = 0;
            while (current != null) {
                c++;
                current = current.next;
            }
            return c;

        }

        void InsertatBeggining(int data) {
            noding newN = new noding(data);
            if (head == null) {
                head = tail = newN;
            } else {
                newN.next = head;
                head = newN;
            }
        }

        void InsertatEnd(int data) {
            noding newN = new noding(data);
            if (head == null) {
                head = tail = newN;
            } else {
                tail.next = newN;
                tail = newN;
            }
        }

        void InsertatMid(int index, int data) {
            noding temp = head;
            noding newN = new noding(data);
            if (head == null) {
                head = tail = newN;
            } else {
                for (int i = 0; i <= index - 1; i++) {
                    temp = temp.next;
                }
                newN.next = temp.next;
                temp.next = newN;
            }
        }

        void deleteatBeggining() {
            if (head == null) {
                System.out.println("There is No Data in the list for Delete");
                return;
            } else {
                head = head.next;
            }
        }

        void deleteAtend() {
            if (head == null) {
                System.out.println("There is no Value in the Data");
            } else {
                noding temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                tail = temp;
            }
        }

        void deleteAnyIndex(int index) {
            noding temp = head;
            if (head == null) {
                System.out.println("There is no Value in the Data");
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            try {
                if (index > counnt()) {
                    System.out.println("Invalid Index");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        }

        void choice(int press) {
            System.out.println(
                    "Press 1: To Create Node  in Linked List\nPress 2: To Display\nPress 3: To Insert Element in Beggining\nPress 4: To Insert Element in Middle\nPress 5: To Insert Element at End\nPress 6: TO Delete ELement  From the Begonnong\nPress 7: To Delete Element from any of the Index\nPress 8:To Delete Element from the End\n Press 9: To Count the Size of the  Linked List\nPress 10: Exit");
            while (true) {
                press = sc.nextInt();

                if (press < 11) {

                    switch (press) {
                        case 1:
                            create();
                            break;
                        case 2:
                            disp();
                            break;
                        case 3:
                            System.out.println("Enter the Value want to add in Beggining");
                            InsertatBeggining(sc.nextInt());
                            break;
                        case 4:
                            System.out.println("Enter the Index and the Value want to Insert in that Index");
                            InsertatMid(sc.nextInt(), sc.nextInt());
                            break;
                        case 5:
                            System.out.println("Enter the Value want to add at End");
                            InsertatEnd(sc.nextInt());
                            break;
                        case 6:
                            deleteatBeggining();
                            break;
                        case 7:
                            System.out.println("From which Index You want to delete Node");
                            deleteAnyIndex(sc.nextInt());
                            break;
                        case 8:
                            deleteAtend();
                            break;
                        case 9:
                            counnt();
                            break;
                        case 10:
                            break;
                        default:
                            System.out.println("Invlid Press");
                            break;
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listing o = new listing();
        o.create();
        o.deleteAnyIndex(sc.nextInt());
        // int res=o.counnt();
        // System.out.println(res);
        o.disp();
    }
}