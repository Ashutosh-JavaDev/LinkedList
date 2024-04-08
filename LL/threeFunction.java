
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
        Three head;
        Three tail = null;

        void create() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press stop to Stop inserting Value");
            while (true) {
                System.out.println("Enter Value in the List: ");
                String st = sc.nextLine();
                if (st.equalsIgnoreCase("Stop")) {
                    return;
                } else {
                    int num = Integer.parseInt(st);
                    Three a = new Three(num);
                    a.next = tail;
                }
            }
        }
        void disp(){
            Three temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
    }
}
