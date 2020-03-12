import java.util.Scanner;

/**
 * 题目描述
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 * 输入描述:
 * 每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
 * 输出描述:
 * 输出一行表示最大的乘积。
 *
 * 示例1
 * 输入
 * 3
 * 7 4 7
 * 2 50
 * 输出
 * 49
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/12 11:02 上午
 */
public class 合唱团 {
    public static long currentMax = 0;//当前最优值
    public static int k;
    public static int d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        k = sc.nextInt();
        d = sc.nextInt();

        int curNum = 0;//当前参与乘积的元素个数
        int curIndex = 0;//当前下标
        int preSumValue = 1;//上一次累积得到的最大值
        int preIndex = -1;//上一个参与乘积的元素下标
        findMax(curNum, curIndex, preIndex, preSumValue, arr);
        System.out.println(currentMax);
    }

    public static void findMax(int curNum, int curIndex, int preIndex, long preSumValue, int[] arr) {
        if (curNum == k) {//参与乘积的个数为k
            if (preSumValue > currentMax) {//最优值替换
                currentMax = preSumValue;
            }
            return;
        }
        if (curNum + arr.length - curIndex < k) {//当前参与乘积的个数+剩余未考虑的元素个数 还不够k个，减枝
            return;
        }
        if (curIndex >= arr.length) {//数组越界了，减枝
            return;
        }
        if (curNum < k) {//实际上这个if不需要判断，能走到这一步，if这个条件一定是成立的。但是为了更好的理解，这里判断下。
            if (curIndex - preIndex <= d || preIndex == -1) {//不可忽略preIndex=-1的情况，这里容易遗漏
                findMax(curNum, curIndex + 1, preIndex, preSumValue, arr);//当前下标不参与运算
                //result[curNum] = arr[curIndex];
                findMax(curNum + 1, curIndex + 1, curIndex, preSumValue * arr[curIndex], arr);//当前下标参与运算
            } else {
                return;
            }
        }
    }

}
