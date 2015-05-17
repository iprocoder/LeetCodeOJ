/**
 * Created by iprocoder on 15-5-17.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addLists(l1, l2, 0);
    }

    public ListNode addLists(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0)
            return null;

        int value = carry;
        if (l1 != null) value += l1.val;
        if (l2 != null) value += l2.val;
        carry = value / 10;
        ListNode result = new ListNode(value % 10);
        ListNode more = addLists(l1 == null ? null : l1.next,
                l2 == null ? null : l2.next, carry);
        result.next = more;
        return result;
    }
}
