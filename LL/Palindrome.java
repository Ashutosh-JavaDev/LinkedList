public class Palindrome {
    public static class palin {
        int data;
        palin next;

        palin(int data) {
            this.data = data;
        }
    }

    public static class drome {
        public static void rem(palin head) {
            palin temp = head;
            String st = " ";
            String str = " ";
            while (temp != null) {
                int d = temp.data;
                st = d + " ";
                temp = temp.next;
            }
            for (int i = st.length(); i >= 0; i--) {
                char ch = st.charAt(i);
                str = ch + " ";
            }
            if (st.equals(str)) {
                System.out.println("List is Palindrome");
            } else {
                System.out.println("List is not palindrome");
            }
        }

        public static void disp(palin head) {
            palin temp = head;
            if (temp == null) {
                return;
            }
            System.out.print(temp.data + " ");
            disp(temp.next);
        }
    }
}
