/**
 * Created by iprocoder on 2015/5/6.
 */
public class RemoveLinkedListElements {
//    public ListNode removeElements(ListNode head, int val) {
//        ListNode cur = head;
//        ListNode pre;
//        while (cur != null) {
//            if (cur.val == val) {
//                pre.next = cur.next;
//            }
//            cur = cur.next;
//        }
//        return head;
//    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode tail = removeElements(head.next, val);
        if (head.val == val) {
            return tail;
        } else {
            head.next = tail;
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new RemoveLinkedListElements().removeElements(l1, 2);
        System.out.println(l3.val);
    }
}
