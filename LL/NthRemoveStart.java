import java.util.Scanner;
public class NthRemoveStart {
    public static class nthStartRem{
        int data;
        nthStartRem next;
        nthStartRem(int data){
            this.data=data;
        }
    }
    public static class NthRemovingStart{
        public static void NthStartRem(nthStartRem head,int index){
            nthStartRem temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        public static void disp(nthStartRem head){
            nthStartRem temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nthStartRem a=new nthStartRem(1);
        nthStartRem b=new nthStartRem(12);
        nthStartRem c=new nthStartRem(13);
        nthStartRem d=new nthStartRem(14);
        nthStartRem e=new nthStartRem(15);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

    }
}
