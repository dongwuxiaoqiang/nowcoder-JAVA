import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/16 10:10 上午
 */
public class T316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String first = scanner.nextLine();
        // int n = Integer.valueOf(first.split(" ")[0]);
        // int l = Integer.valueOf(first.split(" ")[1]);
        int n = scanner.nextInt();
        int l = scanner.nextInt();

        // System.out.println("n = " + n + ", l = " + l);

        int nn[] = new int[n];
        for (int i = 0; i < n; i++) {
            nn[i] = scanner.nextInt();
        }

        // System.out.println("找到最大的差值");
        // 找到最大的差值

        // 排序

        for (int i = 0; i < nn.length; i++) {
            for (int j = 0; j < nn.length - 1 - i; j++) {
                if (nn[j] > nn[j + 1]) {
                    int temp = nn[j + 1];
                    nn[j + 1] = nn[j];
                    nn[j] = temp;
                }
            }
        }

        // for (int i = 0; i < n; i++) {
        //     int minIndex = i;
        //     for (int j = i; j < n; j++) {
        //         if (nn[j] < nn[minIndex]) {
        //             minIndex = j;
        //         }
        //     }
        //     int temp = nn[i];
        //     nn[i] = nn[minIndex];
        //     nn[minIndex] = temp;
        // }


        for (int i = 0; i < n; i++) {
            System.out.print(nn[i] + " ");
        }

        int maxV = 0;
        for (int i = 1; i < n; i++) {
            if (nn[i] - nn[i - 1] > maxV) {
                maxV = nn[i] - nn[i - 1]; // 3
            }
        }
        // System.out.println(maxV);

        int t1 = nn[0]; // 第一个灯到起点的位置
        int t2 = l - nn[n - 1]; // 最后一个灯到终点的位置

        int t = 0;
        if (t1 > t2) {
            t = t1;
        } else {
            t = t2;
        }

        float resutl = 0.0f;
        if (t > maxV / 2.0) {
            resutl = t;
        } else {
            resutl = maxV / 2.0f;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        String format = df.format(resutl);
        System.out.println(format);
    }
}
