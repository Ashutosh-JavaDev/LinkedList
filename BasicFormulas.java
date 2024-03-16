package LinkedList;

import java.util.Scanner;

public class BasicFormulas {
    public static class noding {
        int data;
        noding next;

        noding(int data) {
            this.data = data;
        }
    }

    public static class listing {
        noding head = null;
        noding tail = null;
        Scanner sc = new Scanner(System.in);

        void create() {
            System.out.println("Press Stop to stop inserting Data");
            String str;
            while (true) {
                str = sc.nextLine();
                if (str.equalsIgnoreCase("Stop")) {
                    break;
                }
                else{
                    try{
                        int data=Integer.parseInt(str);
                        noding newN=new noding(data);
                        if(head==null){
                            head=tail=newN;
                        }
                        else{
                            tail.next=newN;
                            tail=newN;
                        }
                    }
                    catch(NumberFormatException e){
                        System.out.println("Invalid Input\nPress Stop or insert adding Number");
                    }
                }
            }
        }
        void disp(){
            noding current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
        void InsertatBeggining(int data){
            noding newN=new noding(data);
            if(head==null){
                head=tail=newN;
            }
            else{
                newN.next=head;
                head=newN;
            }
        }
    }
    public static void main(String[] args) {
            listing o=new listing();
            o.create();
            o.disp();
    }
}