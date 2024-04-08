import java.util.Scanner;
public class findNthNumber {
    public static class NthNumber{
        int data;
        NthNumber next;
        NthNumber(int value){
            this.data=value;
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
}
