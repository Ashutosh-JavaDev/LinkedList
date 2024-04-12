public class TwoArrayMerge {
    int data;
    TwoArrayMerge next;

    TwoArrayMerge(int data) {
        this.data = data;
    }

    public static class mergeTwoArray {
        public static TwoArrayMerge merging(TwoArrayMerge l1, TwoArrayMerge l2) {
            TwoArrayMerge dummy = new TwoArrayMerge(0);
            TwoArrayMerge temp = dummy;
            while (l1 != null && l2 != null) {
                if (l1.data <= l2.data) {
                    temp.next = l1;
                    l1 = l1.next;
                } else {
                    temp.next = l2;
                    l2 = l2.next;
                }
                temp = temp.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
            return temp.next;
        }
    }

    public static void disp(TwoArrayMerge head) {
        TwoArrayMerge temp = head;
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + " ");
        disp(temp.next);
    }
}
