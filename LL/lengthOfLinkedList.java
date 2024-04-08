import java.util.Scanner;
class length{
    int data;
    length next;
    length (int value){
        this.data=data;
    }   
    public static void disp(length head){
        length temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    } 
}

public class lengthOfLinkedList {
    
}
