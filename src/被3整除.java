import java.util.Scanner;

/**
 * 题目描述
 * 小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。
 * <p>
 * 并且小Q对于能否被3整除这个性质很感兴趣。
 * <p>
 * 小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
 * <p>
 * 输入描述:
 * 输入包括两个整数l和r(1 <= l <= r <= 1e9), 表示要求解的区间两端。
 * 输出描述:
 * 输出一个整数, 表示区间内能被3整除的数字个数。
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 10:47 上午
 */
public class 被3整除 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 1 && a <= b && b <= 1000000000) {
            int count = 0;
            long sum = 0;
            for (int n = a; n <= b; n++) {
                if (n == a) {
                    for (long i = a; i > 0; i--) {
                        sum += i;
                    }
                } else {
                    sum = sum + n;
                }
                if (sum % 3 == 0)
                    count++;
            }
            System.out.println(count);
        } else {
            System.out.println(0);
        }
    }
}
