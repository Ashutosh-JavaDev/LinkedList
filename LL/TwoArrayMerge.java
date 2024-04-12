public class TwoArrayMerge {
    public static class merging {
        int data;
        merging next;

        merging(int data) {
            this.data = data;
        }

    }

    public static class ok {
        public static merging merg(merging l1, merging l2) {
            merging dummy = new merging(0);
            merging temp = dummy;
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
                temp.next = l1;
            } else {
                temp.next = l2;
            }
            return dummy.next;
        }

        public static void disp(merging head) {
            merging temp = head;
            if (temp == null) {
                return;
            }
            System.out.print(temp.data + " ");
            disp(temp.next);
        }
    }

    public static void main(String[] args) {
        ok ob = new ok();
        merging l1 = new merging(1);
        l1.next = new merging(3);
        l1.next.next = new merging(5);
        ob.disp(l1);
        System.out.println();
        merging l2 = new merging(2);
        l2.next = new merging(4);
        l2.next.next = new merging(6);
        ob.disp(l2);
        System.out.println();
        merging res = ob.merg(l1, l2);
        ob.disp(res);
        System.out.println();
    }
}
