public class ReverseList {

    /*  剑指offer--反转链表
    *   Q: 输入一个链表，反转链表后，输出新链表的表头。
    *   A: 在结点前后设置指针，递归反转
    *       1、判断当前结点是否为空
    *       2、循环每个结点进行反转
    *
    *
     */


    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            //保存好当前结点的next，将当前结点的next指向前一个结点
            next = head.next;
            head.next = pre;
            //将指针归位，为下一次反转做好准备
            pre = head;
            head = next;
        }
        return pre;
    }
}
