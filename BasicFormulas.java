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

        void create(int data) {
            System.out.println("Press Stop to stop inserting Data");
            String str;
            while (true) {
                str = sc.nextLine();
                if (str.equalsIgnoreCase("Stop")) {
                    break;
                }
            }
        }
    }
}