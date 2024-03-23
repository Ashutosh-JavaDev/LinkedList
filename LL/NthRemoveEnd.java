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
            nthRemove temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nthRemove a=new nthRemove(12);
        nthRemove b=new nthRemove(11);
        nthRemove c=new nthRemove(13);
        nthRemove d=new nthRemove(14);
        nthRemove e=new nthRemove(15);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        NthNodeRemove ob=new NthNodeRemove();
        ob.Disp(a);
        ob.removeEnd(a, 4);
        ob.Disp(a);

    }
}
