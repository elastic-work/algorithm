import java.util.ArrayList;
import java.util.Stack;


class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

/*  剑指offer--从尾到头打印链表
*   Q: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
*   A: 利用stack先进后出的特性实现：
*      1、判断链表是否为空? 返回空Arraylist : 继续下一步
*      2、将listnode压入stack
*      3、通过stack pop进ArrayList
* */

public class printListFromTailToHead{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if (listNode == null){
            ArrayList list = new ArrayList();
            return list;
        }
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }

        return list;
    }
}