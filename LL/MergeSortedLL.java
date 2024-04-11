public class MergeSortedLL {
    public static class merge {
        int data;
        merge next;

        merge(int data) {
            this.data = data;
        }
    }

    public static merge sorted(merge l1, merge l2) {
        merge dummy = new merge(0);
        merge current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return dummy.next;
    }

    public static void disp(merge head) {
        merge temp = head;
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + " ");
        disp(temp.next);
        System.out.println();
    }

    public static void main(String[] args) {
        merge l1 = new merge(1);
        l1.next = new merge(3);
        l1.next.next = new merge(5);
        merge l2 = new merge(2);
        l2.next = new merge(4);
        l2.next.next = new merge(6);
        System.out.println("List 1:");
        disp(l1);
        System.out.println("List 2:");
        disp(l2);
        merge sorted = sorted(l1, l2);
        System.out.println("Merge List");
        disp(sorted);

    }
}
