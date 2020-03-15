import java.util.Scanner;

/**
 * 题目描述
 * 描述：
 * <p>
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * <p>
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * <p>
 * <p>
 * 输入描述:
 * 输入一个int整数
 * <p>
 * 输出描述:
 * 将这个整数以字符串的形式逆序输出
 * <p>
 * 示例1
 * 输入
 * 复制
 * 1516000
 * 输出
 * 复制
 * 0006151
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 7:33 下午
 */
public class 数字颠倒 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
