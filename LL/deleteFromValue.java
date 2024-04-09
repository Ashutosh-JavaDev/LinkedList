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
}
