package LinkedList;

import java.util.Scanner;

public class NthNodeFromstart {
    public static class nthNode {
        int data;
        nthNode next;

        nthNode(int data) {
            this.data = data;
        }
    }
    public static class NthFind{
        public static void finding(nthNode head,int index){
            nthNode temp=head;
           for(int i=0;i<=index;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public static void main(String[] args) {
        
    }
}
