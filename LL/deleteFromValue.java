public class deleteFromValue {
    public static class itemNode {
        int data;
        itemNode next;

        itemNode(int data) {
            this.data = data;
        }
    }

    public static class deleteValue {
        public static void askDelete(itemNode head, int value) {
            int c = 0;
            if (head != null && value == head.data) {
                head = head.next;
                return;
            }
            itemNode temp = head;

            while (temp != null && temp.next.data != value && temp.next != null) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Value is Not in the List for Delete");
                return;
            }
            temp.next = temp.next.next;
        }

        public static void disp(itemNode head) {
            itemNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");

                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        itemNode a = new itemNode(1);
        itemNode b = new itemNode(2);
        itemNode c = new itemNode(3);
        itemNode d = new itemNode(4);
        itemNode e = new itemNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        deleteValue ob = new deleteValue();
        ob.disp(a);
        ob.askDelete(a, 1);
        ob.disp(a);
    }
}
