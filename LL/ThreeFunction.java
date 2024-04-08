import java.util.Scanner;

public class ThreeFunction {
    public static class Three {
        int data;
        Three next;

        Three(int data) {
            this.data = data;
        }
    }

    public static class Functions {
        Three head = null;
        Three tail = null;

        void create() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 'Stop' to stop inserting values");
            System.out.println("Enter values in the list: ");
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
                        System.out.println("Please enter a valid number or 'Stop'");
                    }
                }
            }
        }

        void delete(int pos) {
            if (pos > count()) {
                System.out.println("Invalid Position");
                return; // Exit the method if the position is invalid
            }
            Three temp = head;
            if (pos == 1) {
                head = temp.next;
                return;
            }
            for (int i = 0; i < pos - 2; i++) { // Adjusted the loop condition
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        void disp() {
            Three temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int count() {
            int c = 0;
            Three temp = head;
            while (temp != null) {
                c++;
                temp = temp.next; // Move temp pointer inside the loop
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Functions ob = new Functions();
        ob.create();
        ob.delete(1);
        ob.disp();
    }
}
