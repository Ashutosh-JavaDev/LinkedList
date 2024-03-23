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
        public static void finding(nthNode head){
            nthNode temp=head;
            while(temp!=null){
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
