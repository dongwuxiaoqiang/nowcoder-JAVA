import java.util.Scanner;

/**
 * 给定一个整数数组，返回一个数组。该返回数组中第i个数字为，原数组中第i个位置的数字至少往右走多少步才能遇到比它大的数字。如果遇不到或者已经处于最右的位置，则置为-1。
 * <p>
 * <p>
 * 输入描述:
 * 输入为多行，第一行为一个整数N，1≤N≤106
 * <p>
 * 接下来一共有N行，每一行为一个整数M，0≤M≤232-1
 * <p>
 * <p>
 * <p>
 * 输出描述:
 * 输出 N 行，每行一个数字表示转换之后的数组
 * <p>
 * 输入
 * 5
 * 91
 * 10
 * 3
 * 22
 * 40
 * 输出
 * -1
 * 2
 * 1
 * 1
 * -1
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/12 4:21 下午
 */
public class 比大小 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long nn[] = new long[n];
        long nnv[] = new long[n];
        for (int i = 0; i < n; i++) {
            nn[i] = scanner.nextInt();

            // i = 2 j = 0
            for (int j = 0; j < i; j++) {
                if (nn[j] < nn[i]) {
                    if (nnv[j] == 0) {
                        nnv[j] = i - j;
                    }
                }
            }
        }

        // int[] cv = new int[n];
        // for (int i = 0; i < n; i++) {
        //     long t = nn[i];
        //
        //     for (int j = i + 1; j < n; j++) {
        //         cv[i] = cv[i] + 1;
        //         if (nn[j] > t) {
        //             break;
        //         } else {
        //             if (j == n - 1) {
        //                 cv[i] = 0;
        //             }
        //         }
        //     }
        // }
        for (int i = 0; i < n; i++) {
            System.out.println(nnv[i] == 0 ? -1 : nnv[i]);
        }
    }
}
