import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/12 10:34 上午
 */
public class 从头到尾打印链表 {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode != null) {
            list.add(listNode.val);
            while (listNode.next != null) {
                listNode = listNode.next;
                list.add(listNode.val);
            }
            Collections.reverse(list);
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode listNodeRoot = new ListNode(0);
        ListNode listNodeHead = listNodeRoot;
        ListNode listNode = null;
        for (int i = 1; i < 10; i++) {
            listNode = new ListNode(i);
            listNodeHead.next = listNode;
            listNodeHead = listNode;
        }
        ArrayList<Integer> integers = printListFromTailToHead(listNodeRoot);
        System.out.println(integers);
    }
}
