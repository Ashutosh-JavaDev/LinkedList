import java.util.Scanner;

public class NthRemoveEnd {
    public static class nthRemove {
        int data;
        nthRemove next;

        nthRemove(int data) {
            this.data = data;
        }
    }
    public static class NthNodeRemove{
        public static void removeEnd(nthRemove head, int index){
            nthRemove slow=head;
            nthRemove fast=head;
            for(int i=0;i<index;i++){
                fast=fast.next;
            }
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;

        }
        public static void Disp(nthRemove head){
            nthRemove tem=head;
            while(tem!=null){
                System.out.print(tem.data+" ");
                tem=tem.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        nthRemove a=new nthRemove(12);
        nthRemove b=new nthRemove(11);
        nthRemove c=new nthRemove(13);
        nthRemove d=new nthRemove(14);
        nthRemove e=new nthRemove(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        NthNodeRemove rem=new NthNodeRemove();
        rem.Disp(a);
        System.out.println("Which Index You Want to remove from End?");
        int index=ac.nextInt();
        rem.removeEnd(a,index);
        rem.Disp(a);

    }
}
