import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/15 3:28 下午
 */
public class 整数反转 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            System.out.println(0);
            return;
        }
        int reverse = reverse((int) x);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        String s1 = s.replaceAll("-", "");
        int len = s1.length();

        String ss = "";
        for (int i = len - 1; i >= 0; i--) {
            ss += s1.substring(i, i + 1);
        }
        // System.out.println(ss);

        // try {
        //     if(x<0){
        //         return Integer.valueOf(ss) * -1;
        //     }else{
        //         return Integer.valueOf(ss);
        //     }
        // }catch (Exception e){
        //     return 0;
        // }

        // System.out.println(Integer.MAX_VALUE);

        int flag = 1;
        if (x < 0) {
            flag = -1;
        }
        if (len > 10) {
            return 0;
        } else if (len == 10) {
            if (Integer.valueOf(ss.substring(0, 1)) > 2) {
                return 0;
            } else if (Integer.valueOf(ss.substring(0, 1)) == 2) {
                // System.out.println(ss.substring(1, ss.length()));
                if (Integer.valueOf(ss.substring(1, ss.length())) > 147483647) {
                    return 0;
                } else {
                    return Integer.valueOf(ss) * flag;
                }
            } else {
                return Integer.valueOf(ss) * flag;
            }
        } else {
            return Integer.valueOf(ss) * flag;
        }
    }
}
