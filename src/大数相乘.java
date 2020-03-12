import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/12 7:46 下午
 */
public class 大数相乘 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        String s1 = arr[0];
        String s2 = arr[1];
        int[] a = new int[s1.length()];
        int[] b = new int[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            a[i] = Integer.valueOf(s1.substring(i, i + 1));
        }
        for (int i = 0; i < s2.length(); i++) {
            b[i] = Integer.valueOf(s2.substring(i, i + 1));
        }

        // 结果集
        int[] result = new int[a.length + b.length];
        // 计算
        bigDataComput(a, b, result);
    }

    /**
     * <pre>
     *
     *       7 8 9 6 5 2
     * ×         3 2 1 1
     * -----------------
     *       7 8 9 6 5 2   <---- 第1趟
     *     7 8 9 6 5 2     <---- 第2趟
     *    ..........       <---- 第n趟
     * -----------------
     *   ? ? ? ? ? ? ? ?   <---- 最后的值用另一个数组表示
     *
     *       5 5 5
     *  x    5 5 5
     * -------------
     *     2 7 7 5
     *   2 7 7 5
     * 2 7 7 5
     * -------------
     * 3 0 8 0 2 5
     *
     *
     * </pre>
     */

    /**
     * @param num1
     * @param num2
     * @param result
     */
    public static void bigDataComput(int[] num1, int[] num2, int[] result) {
        int carry = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            carry = 0;
            for (int j = num2.length - 1; j >= 0; j--) {
                // 5 5 5
                // 5 5 5
                // i = 2 j = 2
                // System.out.println("i = " + i + ", j = " + j);
                // System.out.println("num1[" + i + "] " + num1[i]);
                // System.out.println("num2[" + j + "] " + num2[j]);
                // System.out.println("result[" + (i + j + 1) + "] = " + result[i + j + 1]);
                // result[5] = 5 * 5 + 0 + 0
                int temp = num1[i] * num2[j] + carry + result[i + j + 1];
                // System.out.println("temp = " + temp);
                result[i + j + 1] = temp % 10; // 零头
                carry = temp / 10; // 进位
                // System.out.println("result[" + (i + j + 1) + "] = " + result[i + j + 1]);
                // System.out.println("carry = " + carry);
            }
            // 最后仍有进位，则保存进位到高位
            if (carry != 0) {
                result[i] = carry;
            }
            // System.out.println("result["+i+"] = " +result[i]);
        }

        // 打印计算结果
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) {
            } else {
                sb.append(result[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
