import java.util.Scanner;

public class linkedlist {
    public static class listing {
        int data;
        listing next;

        listing(int data) {
            this.data = data;
        }

    }

    public static class list {
        listing head = null;
        listing tail = null;

        void InsertatBeg(int data) {
            listing newN = new listing(data);
            if (head == null) {
                head = tail = newN;
            } else {
                newN.next = head;
                head = newN;
            }
        }
        void display() {
            listing temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtEnd(int data) {
            listing newN = new listing(data);
            if (head == null) {
                head = tail = newN;
            } else {
                tail.next = newN;
                tail = newN;
            }
        }

        void insertAt(int index, int data) {
            listing newN = new listing(data);
            
            // if(head==null){
            // insertAtEnd(data);
            // }

            listing temp = head;
            if(index==size()){
                insertAtEnd(data);
                return;
            }
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            newN.next=temp.next;
            temp.next=newN;
        }
        int size(){
            listing temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void deleteNode(int index){
            listing temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            temp=tail=null;
        }

    }

    public static void main(String[] args) {
        list ll = new list();
        ll.InsertatBeg(1);
        ll.InsertatBeg(12);
        ll.InsertatBeg(15);
        ll.insertAtEnd(100);
        ll.insertAt(4, 234);

        ll.display();
        System.out.println(ll.tail.data);
    }

    
    
}
