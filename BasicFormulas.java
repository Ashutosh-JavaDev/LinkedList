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
            int c=0;
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
                for(int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
            try{
                if(index>counnt()){
                    System.out.println("Invalid Index");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            
           
        }
        void choice(int press){

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