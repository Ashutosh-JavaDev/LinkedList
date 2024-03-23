package LinkedList;
import java.util.Scanner;;
public class NthFromtheEnd {
    public static class nthEnd{
        int data;
        nthEnd next;
        nthEnd(int data){
            this.data=data;
        }
    }
    public class nthEndNode{
        public static void ending(nthEnd head,int index){
            nthEnd fast=head;
            nthEnd slow=head;
            for(int i=0;i<index;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            System.out.println(slow.data);
        }
    }
}
