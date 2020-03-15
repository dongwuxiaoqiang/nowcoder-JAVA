import java.util.Scanner;

/**
 * 题目描述
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * <p>
 * 输入描述:
 * 输入一个int型整数
 * <p>
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 * <p>
 * 示例1
 * 输入
 * 复制
 * 9876673
 * 输出
 * 复制
 * 37689
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 6:20 下午
 */
public class 提取不重复的数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        // System.out.println(n);

        int nn[] = new int[10];
        for (int i = 0; i < 10; i++) {
            nn[i] = -1;
        }

        int index[] = new int[n];
        int k = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int v = Integer.valueOf(s.substring(i, i + 1));
            // System.out.println(v);
            // System.out.println("nn["+v+"] = " + nn[v]);
            if (nn[v] == -1) {
                nn[v] = v;
                index[k++] = v;
            }
        }

        for (int i = 0; i < index.length; i++) {
            if (nn[index[i]] != -1) {
                System.out.print(nn[index[i]]);
            }
        }
        System.out.println();

    }
}
