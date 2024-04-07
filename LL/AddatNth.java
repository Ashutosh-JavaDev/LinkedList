import java.util.Scanner;

public class AddatNth {
    public static class addNth {
        int data;
        addNth next;

        addNth(int data) {
            this.data = data;
        }
    }

    public static class nthAdd {
        public static void adding(addNth head, int position, int value) {
            addNth temp = new addNth(value);
            addNth item = head;
            for (int i = 0; i <=position; i++) {
                item = item.next;
            }
            temp.next=item.next.next;
            item.next=temp;
        }
        public static void display(addNth head){
            addNth temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        addNth a=new addNth(1);
        addNth b=new addNth(2);
        addNth c=new addNth(4);
        addNth d=new addNth(5);
        a.next=b;
        b.next=c;
        c.next=d;
        nthAdd ob=new nthAdd();
        System.out.println("Enter the Position where you want ot add Data");
        int position=sc.nextInt();
        ob.adding(a, position, 3);





    }
}
