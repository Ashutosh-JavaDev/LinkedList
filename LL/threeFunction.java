
// Insertion, Delete and Transveral
import java.util.Scanner;

public class threeFunction {
    public static class Three {
        int data;
        Three next;

        Three(int data) {
            this.data = data;
        }
    }

    public static class functions {
        Three head = null;
        Three tail = null;

        void create() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press stop to Stop inserting Value");
            System.out.println("Enter Value in the List: ");
            while (true) {
                String st = sc.nextLine();
                if (st.equalsIgnoreCase("Stop")) {
                    break;
                } else {
                    try {
                        int num = Integer.parseInt(st);
                        Three newN = new Three(num);
                        if (head == null) {
                            head = tail = newN;
                        } else {
                            tail.next = newN;
                            tail = newN;
                        }
                    } catch (Exception e) {
                        System.out.println("Press Stop or Add Number");
                    }
                }
            }
        }
        int count(){
            int c=0;
            Three temp=head;
            while(temp!=null){
                c++;
            }
            return c;
        }

        void delete(int pos) {
            // System.out.println("Ent")
            Three temp = head;
            if(head==null){
                System.out.println("There is No value in this data");
            }
            for (int i = 0; i < pos-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(pos>count()){
                System.out.println("Invalid Position");
            }
        }

        void disp() {
            Three temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        functions ob = new functions();
        ob.create();
        ob.delete(4);
        ob.disp();
    }
}
