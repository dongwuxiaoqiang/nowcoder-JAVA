import java.util.Scanner;

/**
 * 题目描述
 * 小Q正在给一条长度为n的道路设计路灯安置方案。
 * <p>
 * 为了让问题更简单,小Q把道路视为n个方格,需要照亮的地方用'.'表示, 不需要照亮的障碍物格子用'X'表示。
 * <p>
 * 小Q现在要在道路上设置一些路灯, 对于安置在pos位置的路灯, 这盏路灯可以照亮pos - 1, pos, pos + 1这三个位置。
 * <p>
 * 小Q希望能安置尽量少的路灯照亮所有'.'区域, 希望你能帮他计算一下最少需要多少盏路灯。
 * <p>
 * 输入描述:
 * 输入的第一行包含一个正整数t(1 <= t <= 1000), 表示测试用例数
 * 接下来每两行一个测试数据, 第一行一个正整数n(1 <= n <= 1000),表示道路的长度。
 * 第二行一个字符串s表示道路的构造,只包含'.'和'X'。
 * 输出描述:
 * 对于每个测试用例, 输出一个正整数表示最少需要多少盏路灯。
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 10:47 上午
 */
public class 安置路灯 {
    public static int count(int n, String s) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;
        int i = 0;
        while (i < n) {
            String j = String.valueOf(s.charAt(i));
            if (j.equals(".")) {
                i += 3;
                count++;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();//多少条路
        int n = 0;//路的长度
        String s = "";//路的构造 .x
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            s = scanner.next();
            a[i] = count(n, s);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(a[i]);
        }
    }
}
