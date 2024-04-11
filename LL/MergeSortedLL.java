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
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        return dummy.next;
    }
}
