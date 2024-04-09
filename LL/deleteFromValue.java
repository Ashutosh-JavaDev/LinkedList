public class deleteFromValue {
    public static class ItemNode {
        int data;
        ItemNode next;

        ItemNode(int data) {
            this.data = data;
        }
    }

    public static class DeleteValue {
        public static ItemNode askDelete(ItemNode head, int value) {
            // Check if the head node needs to be deleted
            if (head != null && head.data == value) {
                return head.next; // Return the new head after deletion
            }

            ItemNode temp = head;

            while (temp != null && temp.next != null) {
                if (temp.next.data == value) {
                    temp.next = temp.next.next; // Skip the node to be deleted
                    return head; // Return the original head
                }
                temp = temp.next;
            }

            System.out.println("Value is not in the list for deletion.");
            return head; // Return the original head as no deletion was performed
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
        a = ob.askDelete(a, 1); // Update the head after deletion
        ob.disp(a); // Display the modified list
    }
}
