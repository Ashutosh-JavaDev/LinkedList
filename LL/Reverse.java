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
    public static void main(String[] args) {
        rev a=new rev(1);
        rev b=new rev(2);
        rev c=new rev(3);
        rev d=new rev(4);
        rev e=new rev(5);
        

    }
}
