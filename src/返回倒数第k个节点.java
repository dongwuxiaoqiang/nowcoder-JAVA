import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/16 6:02 下午
 */
public class 返回倒数第k个节点 {
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
            listNodeCurr = listNodeCurr.next;
        }

        int t =  kthToLast(listNodeHead, 2);
        System.out.println(t);
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int kthToLast(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            // System.out.print(temp.val + " ");
            temp = temp.next;
            count++;
        }
        // System.out.println();
        // System.out.println("count = " + count);
        int t = count - k;
        // System.out.println("t = " + t);

        ListNode temp2 = head;
        int i = 0;
        int result = 0;
        while (temp2 != null) {
            // System.out.println(temp.val);
            if(i == t) {
                result = temp2.val;
                break;
            }else{
                temp2 = temp2.next;
                i++;
            }
        }

        return result;
    }
}
