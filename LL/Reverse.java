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
            rev temp=head;
            if(temp==null){
                return;
            }
            revs(temp.next);
            System.out.print(temp.data+" ");
            // System.out.println();
        }
    }
    public static void main(String[] args) {
        rev a=new rev(1);
        rev b=new rev(2);
        rev c=new rev(3);
        rev d=new rev(4);
        rev e=new rev(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        reverse ob=new reverse();
        ob.revs(a);
        System.out.println();
    }
}
