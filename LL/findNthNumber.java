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
            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
            return temp.next.data;
        }
    }  
    public static void main(String[] args) {
        NthNumber a=new NthNumber(1);
        NthNumber b=new NthNumber(2);
        NthNumber c=new NthNumber(3);
        NthNumber d=new NthNumber(4);
        NthNumber e=new NthNumber(5);
        numberNth ob=new numberNth();
        int res=ob.find(a, 2);
        System.out.println("Output: "+res);
    }
}
