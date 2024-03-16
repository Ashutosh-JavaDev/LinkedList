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
        void counnt() {
            noding current = head;
            int c=0;
            while (current != null) {
                c++;
                current = current.next;
            }
            System.out.println();
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
                temp.next=temp.next.next;
                tail=temp;
            }
        }
        void deleteAnyIndex(int index){
            noding temp=head;
            if (head == null) {
                System.out.println("There is no Value in the Data");
            }
            else{
                for(int i=0;i<=index-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listing o = new listing();
        o.create();
        // System.out.println("Insert the value in Start");
        // o.InsertatBeggining(sc.nextInt());
        // System.out.println("Insert the value in the End");
        // o.InsertatEnd(sc.nextInt());
        // System.out.println("Enter the Index where the daa want to insert");
        // int val=sc.nextInt();
        // System.out.println("Insert Data");
        // int da=sc.nextInt();
        // o.InsertatMid(val, da);
        o.deleteatBeggining();
        o.deleteAnyIndex(sc.nextInt());
        o.deleteAtend();
        o.disp();
    }
}