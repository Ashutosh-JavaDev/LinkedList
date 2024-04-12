public class TwoArrayMerge {
    int data;
    TwoArrayMerge next;

    TwoArrayMerge(int data) {
        this.data = data;
    }

    public static class mergeTwoArray {
        public static void merging(TwoArrayMerge l1, TwoArrayMerge l2) {
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
        }
    }
}
