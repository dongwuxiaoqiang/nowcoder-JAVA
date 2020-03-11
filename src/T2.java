import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 10:47 上午
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        // System.out.println(s1);
        char c = sc.next().toLowerCase().charAt(0);
        // System.out.println(c);

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (c1 == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
