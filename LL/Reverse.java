import java.util.Scanner;

public class Reverse {
    public static class rev {
        int data;
        rev next;

        rev(int data) {
            this.data = data;
        }
    }
    public static class reverse{
        void revs(rev head){
            // rev temp=head;
            if(head==null){
                return;
            }
            revs(head.next);
            System.out.print(head.data+" ");
        }
    }
}
