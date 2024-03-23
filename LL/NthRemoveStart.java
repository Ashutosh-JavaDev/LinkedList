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
    }
}
