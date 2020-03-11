import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 10:47 上午
 */
public class T6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for (int x = 1; x <= n; x++) {
            // int y = x - k;  // 余数刚好为2时
            //11 3 2

            // for (int j = 1; j <= n; j++) {
            //     int yu = i % j;
            //     if (yu >= k) {
            //         count++;
            //     }
            // }
        }
        System.out.println(count);
    }
}
