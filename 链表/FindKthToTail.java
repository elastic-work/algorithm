public class FindKthToTail {

    /* 剑指offer--链表中倒数第k个结点
    *  Q: 输入一个链表，输出该链表中倒数第k个结点。
    *  A: 问题转化为正数第n个结点
    *     1、判断是否空
    *     2、获取链表结点数
    *     3、判断结点数是否大于k
    *     4、循环获取第n个结点
    * */
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) return head;
        ListNode node = head;
        int count = 0;
        while (node != null){
            node = node.next;
            count++;
        }
        if(count<k) return null;
        count -= k;
        ListNode p = head;
        for (int i = 0; i <count;i++){
            p = p.next;
        }
        return p;
    }
}
