package LinkedList;
import java.util.Scanner;
public class SinglyLinkedList {
    public static class singly{
        int data;
        singly next;
        singly(int data){
            this.data=data;
        }
    }
    public static class meathod{
        singly head=null;
        singly tail=null;
        Scanner sc=new Scanner(System.in);
        void create(int data){
            singly newN=new singly(data);
            newN.next=head;
            head=newN;
        }
        void display(){
            singly cure=head;
            while(cure!=null){
                System.out.print(cure+" ");
                cure=cure.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         meathod ob=new meathod();
    }
}
