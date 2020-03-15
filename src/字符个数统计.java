import java.util.Scanner;

/**
 * 题目描述
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。
 * <p>
 * 输入描述:
 * 输入N个字符，字符在ACSII码范围内。
 * <p>
 * 输出描述:
 * 输出范围在(0~127)字符的个数。
 * <p>
 * 示例1
 * 输入
 * 复制
 * abc
 * 输出
 * 复制
 * 3
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 7:27 下午
 */
public class 字符个数统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int nn[] = new int[128];
        for (int i = 0; i < 128; i++) {
            nn[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            Integer ascii = Integer.valueOf(s.charAt(i));
            if (ascii < 0 || ascii > 127) {
                continue;
            }
            nn[ascii] = ascii;
        }
        int count = 0;
        for (int i = 0; i < nn.length; i++) {
            if (nn[i] != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
