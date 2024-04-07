import java.util.Scanner;

public class AddatNth {
    public static class addNth {
        int data;
        addNth next;

        addNth(int data) {
            this.data = data;
        }
    }

    public static class nthAdd {
        public static void adding(addNth head, int position, int value) {
            addNth temp = new addNth(value);
            addNth item = head;
            for (int i = 0; i < position; i++) {
                item = item.next;
            }

        }
    }
}
