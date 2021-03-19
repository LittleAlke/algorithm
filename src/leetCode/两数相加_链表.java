package leetCode;


/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，
 * 并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *
 * 提示：
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零。
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}
public class 两数相加_链表 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode node = new ListNode(0);
        head.next = node;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 == null) {
                sum = l2.val + carry;
                carry = sum / 10;
                l2 = l2.next;
                node.next = new ListNode(sum % 10);
                node = node.next;
            } else if (l2 == null) {
                sum = l1.val + carry;
                carry = sum / 10;
                l1 = l1.next;
                node.next = new ListNode(sum % 10);
                node = node.next;
            } else {
                sum = l1.val + l2.val + carry;
                carry = sum / 10;
                l1 = l1.next;
                l2 = l2.next;
                node.next = new ListNode(sum % 10);
                node = node.next;
            }
        }
        if (carry != 0) {
            node.next = new ListNode(carry);
        }
        return head.next.next;
    }
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int b = 1;
//        String s1 = l1.val+"";
//        while (l1.next!=null){
//            s1 = (l1.next.val)+s1;
//            l1 = l1.next;
//        }
//        b = 1;
//        String s2 = l2.val+"";
//        List<Integer> list2 = new ArrayList();
//        while (l2.next!=null){
//            s2 = (l2.next.val+"")+s2;
//            l2 = l2.next;
//        }
//        BigInteger b1 = new BigInteger(s1);
//        BigInteger b2 = new BigInteger(s2);
//        String s = b1.add(b2).toString();
//        ListNode listNode = new ListNode(Integer.valueOf(s.charAt(0)+""));
//        for (int i = 1; i <s.length() ; i++) {
//            listNode = new ListNode(Integer.valueOf(s.charAt(i)+""),listNode);
//        }
//        return listNode;
//    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
//        ListNode l1 = new ListNode(9);
//        ListNode l2 = new ListNode(1,new ListNode(9,new ListNode(9,new ListNode(9))));
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.print(listNode.val + " ");
        while (listNode.next != null) {
            System.out.print(listNode.next.val + " ");
            listNode = listNode.next;
        }
    }
}
