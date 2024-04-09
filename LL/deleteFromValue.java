public class deleteFromValue {
    public static class itemNode {
        int data;
        itemNode next;

        itemNode(int data) {
            this.data = data;
        }
    }

    public static class deleteValue {
        public static void askDelete(itemNode head,int value) {
            itemNode temp=head;
            int c=0;
            while(temp!=null){
                if(temp.next.data==value){
                    c++;
                    temp.next=temp.next.next;
                }
                temp=temp.next;
            }
            if(c==0){
                System.out.println("Value is Not in the List for Delete");
            }

        }
    }
    public static void main(String[] args) {
        itemNode a=new itemNode(1);
        itemNode b=new itemNode(2);
        itemNode c=new itemNode(3);
        itemNode d=new itemNode(4);
        itemNode e=new itemNode(5);

    }
}
