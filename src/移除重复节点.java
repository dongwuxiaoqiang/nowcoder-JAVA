import java.util.Scanner;

/**
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * <p>
 * 示例1:
 * <p>
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 * 示例2:
 * <p>
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 * 提示：
 * <p>
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicate-node-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/16 5:01 下午
 */
public class 移除重复节点 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");

        ListNode listNodeHead = new ListNode(0);
        ListNode listNodeCurr = listNodeHead;
        ListNode listNode = null;
        for (int i = 0; i < arr.length; i++) {
            listNode = new ListNode(Integer.valueOf(arr[i]));
            listNode.next = null;
            listNodeCurr.next = listNode;
        }

        removeDuplicateNodes(listNodeHead);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        ListNode root = new ListNode(-1);
        ListNode node = root;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            if (!find(root, temp)) {
                temp.next = null;
                node.next = temp;
                node = node.next;
            }
            temp = next;
        }
        return root.next;
    }

    private static boolean find(ListNode head, ListNode target) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == target.val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
