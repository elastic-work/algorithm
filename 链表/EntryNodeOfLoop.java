public class EntryNodeOfLoop {

    /*  剑指offer--链表中环的入口结点
    *   Q: 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
    *   A: 快慢指针，若有环，必相遇
    *       1、快指针走两步，满指针走一步
    *       2、相遇点到入口点的距离 = 头结点到入口点的距离
    *       3、若相遇：将两个指针分别在放置在头结点和相遇点，以相同的速度，最后相遇在入口点
    * */

    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null) return null;
        ListNode slow = pHead;
        ListNode fast = pHead;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = pHead;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                if(fast == slow)
                    return slow;
            }
        }
        return null;
    }
}
