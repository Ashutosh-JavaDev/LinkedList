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
        }
    }
}
