import java.util.Scanner;

/**
 * 题目描述
 * 小易觉得高数课太无聊了，决定睡觉。不过他对课上的一些内容挺感兴趣，所以希望你在老师讲到有趣的部分的时候叫醒他一下。你知道了小易对一堂课每分钟知识点的感兴趣程度，并以分数量化，以及他在这堂课上每分钟是否会睡着，你可以叫醒他一次，这会使得他在接下来的k分钟内保持清醒。你需要选择一种方案最大化小易这堂课听到的知识点分值。
 * 输入描述:
 * 第一行 n, k (1 <= n, k <= 105) ，表示这堂课持续多少分钟，以及叫醒小易一次使他能够保持清醒的时间。
 * 第二行 n 个数，a1, a2, ... , an(1 <= ai <= 104) 表示小易对每分钟知识点的感兴趣评分。
 * 第三行 n 个数，t1, t2, ... , tn 表示每分钟小易是否清醒, 1表示清醒。
 * 输出描述:
 * 小易这堂课听到的知识点的最大兴趣值。
 * <p>
 * 输入
 * 6 3
 * 1 3 5 2 5 4
 * 1 1 0 1 0 0
 * 输出
 * 16
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 9:19 下午
 */
public class 瞌睡 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nn = new int[n];
        for (int i = 0; i < n; i++) {
            nn[i] = scanner.nextInt();
        }
        int[] tt = new int[n];
        for (int i = 0; i < n; i++) {
            tt[i] = scanner.nextInt();
        }


    }
}
