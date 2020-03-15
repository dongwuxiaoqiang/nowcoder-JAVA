import java.util.Scanner;

/**
 * 题目描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 * <p>
 * 输入描述:
 * 输入一个十六进制的数值字符串。
 * <p>
 * 输出描述:
 * 输出该数值的十进制字符串。
 * <p>
 * 示例1
 * 输入
 * 复制
 * 0xA
 * 输出
 * 复制
 * 10
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 5:15 下午
 */
public class 进制转化 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            s = s.replaceAll("0x", "");
            System.out.println(Long.parseLong(s, 16));
            // System.out.println(fun(s));
        }
    }

    public static int fun(String s) {
        int n = 0;
        int count = 0;
        int temp = 0;
        char ch;

        while (count < s.length()) {
            ch = s.charAt(s.length() - count - 1);
            if (ch >= '0' && ch <= '9') {
                temp = ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                temp = ch - 'A' + 10;
            } else if (ch >= 'a' && ch <= 'z') {
                temp = ch - 'a' + 10;
            } else {
                break;
            }
            n += temp * Math.pow(16, count);
            count++;
        }

        return n;
    }
}
