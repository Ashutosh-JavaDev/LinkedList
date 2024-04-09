public class DeleteFromValue {
    public static class ItemNode {
        int data;
        ItemNode next;

        ItemNode(int data) {
            this.data = data;
        }
    }

    public static class DeleteValue {
        public static void askDelete(ItemNode head, int value) {
            // Check if the head node needs to be deleted
            if (head != null && head.data == value) {
                head = head.next;
                return;
            }

            ItemNode temp = head;

            // Traverse until the node to be deleted is found or end of list is reached
            while (temp != null && temp.next != null && temp.next.data != value) {
                temp = temp.next;
            }

            if (temp == null || temp.next == null) {
                System.out.println("Value is not in the list for deletion.");
                return;
            }

            // Skip the node to be deleted by adjusting the next reference of its previous node
            temp.next = temp.next.next;
        }

        public static void disp(ItemNode head) {
            ItemNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ItemNode a = new ItemNode(1);
        ItemNode b = new ItemNode(2);
        ItemNode c = new ItemNode(3);
        ItemNode d = new ItemNode(4);
        ItemNode e = new ItemNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        DeleteValue ob = new DeleteValue();
        ob.disp(a); // Display the initial list
        ob.askDelete(a, 6); // Try to delete a value not in the list
        ob.disp(a); // Display the modified list
    }
}
