public class removeDuplicate {
    public static class removeDipli {
        int data;
        removeDipli next;

        removeDipli(int data) {
            this.data = data;
        }
    }

    public static class cate {
        public static void duplicate(removeDipli head) {
            removeDipli temp = head;
            String st = "";
            String str = "";
            while (temp != null) {
                int d = temp.data;
                st += d;
                temp = temp.next;
            }
            for(int i=0;i<st.length();i++){
                char ch=st.charAt(i);
                
            }
        }
    }
}
