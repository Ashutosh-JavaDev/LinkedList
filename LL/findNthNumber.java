import java.util.Scanner;
public class findNthNumber {
    public static class NthNumber{
        int data;
        NthNumber next;
        NthNumber(int data){
            this.data=data;
        }
    }  
    public static class numberNth{
        int find(NthNumber head,int pos){
            NthNumber temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }  
    public static void main(String[] args) {
        NthNumber a=new NthNumber(1);
        NthNumber b=new NthNumber(2);
        NthNumber c=new NthNumber(3);
        NthNumber d=new NthNumber(4);
        NthNumber e=new NthNumber(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        numberNth ob=new numberNth();
        int res=ob.find(a, 1);
        System.out.println("Output: "+res);
    }
}
