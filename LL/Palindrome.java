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
                st+=d;
                temp = temp.next;
            }
            for (int i = st.length()-1; i >= 0; i--) {
                char ch = st.charAt(i);
                str +=ch;
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
    public static void main(String[] args) {
        palin a=new palin(1);
        palin b=new palin(2);
        palin c=new palin(3);
        palin d=new palin(2);
        palin e=new palin(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        drome ob=new drome();
        ob.disp(a);
        System.out.println();

        ob.rem(a);
    }
}
