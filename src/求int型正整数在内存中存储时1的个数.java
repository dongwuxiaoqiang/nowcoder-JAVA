import java.util.Scanner;

/**
 * 题目描述
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * <p>
 * 输入描述:
 * 输入一个整数（int类型）
 * <p>
 * 输出描述:
 * 这个数转换成2进制后，输出1的个数
 * <p>
 * 示例1
 * 输入
 * 复制
 * 5
 * 输出
 * 复制
 * 2
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 8:46 下午
 */
public class 求int型正整数在内存中存储时1的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = Integer.toBinaryString(n);
        // System.out.println(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("1")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
