public class Palindrome {
    public static class palin{
        int data;
        palin next;
        palin(int data){
            this.data=data;
        }
    }
    public static class drome{
        public static void disp(palin head){
            palin temp=head;
            if(temp==null){
                return;
            }
            System.out.print(temp.data+" ");
            disp(temp.next);
        }
    }
}
