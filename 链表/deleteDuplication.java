public class deleteDuplication {

    /*  剑指offer--删除链表中重复的结点
    *   Q: 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    *   A: 直接删除
    *      1、判断是否为空？返回空：继续下一步
    *      2、为链表创建一个头结点
    *      3、下一结点为空:break
    *      4、循环判断当前结点是否与下一结点相等？删除当前结点与下一结点（所以需要三个指针）: 指针后移
    * */

    public ListNode deleteDuplication(ListNode PHead){
        if (PHead == null){
            return null;
        }
        ListNode p = PHead;
        ListNode n = new ListNode(0);
        ListNode pre = n;
        n.next = PHead;

        while (p != null){
            ListNode q = p.next;
            if (q == null){
                break;
            }
            if (p.val ==q.val){
                //删除重复结点
                while (q != null && q.val == p.val){
                    q = q.next;
                }
                pre.next = q;
                p = q;
            }else {
                //指针后移
                pre = p;
                p = q;
            }
        }
        return n.next;

    }
}
