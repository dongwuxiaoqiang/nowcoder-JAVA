import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * <p>
 * 输出描述:
 * 输出到长度为8的新字符串数组
 * <p>
 * 示例1
 * 输入
 * 复制
 * abc
 * 123456789
 * 输出
 * 复制
 * abc00000
 * 12345678
 * 90000000
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 4:01 下午
 */
public class 字符串分割 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        // while (true) {
        //     String s = scanner.nextLine();
        //     s = s.replaceAll(" ", "");
        //     if (!s.equals("")) {
        //         list.add(s);
        //     }
        //     if (list.size() == 2) {
        //         solution(list.get(0));
        //         solution(list.get(1));
        //         list.clear();
        //     }
        // }
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        // show(s1);
        // show(s2);
        task(s1);
        task(s2);

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str1=null;
        // String str2=null;
        // str1=br.readLine();
        // str2=br.readLine();
        // solution(str1);
        // solution(str2);
    }

    public static void show(String s) {
        if (s.length() < 8) {
            String ss = s;
            for (int i = 0; i < 8 - s.length(); i++) {
                ss += "0";
            }
            System.out.println(ss);
        } else {
            int count = s.length() / 8;
            int md = s.length() % 8;
            int start = 0;
            int end = 0;
            for (int i = 0; i < count; i++) {
                start = i * 8;
                end = start + 8;
                System.out.println(s.substring(start, end));
            }
            if (md > 0) {
                start = end;
                end = s.length();
                String ss = s.substring(start, end);
                for (int i = 0; i < 8 - md; i++) {
                    ss += "0";
                }
                System.out.println(ss);
            }
        }
    }

    private static void task(String str) {
        int n = str.length();

        int l = 0;
        int md = n % 8;
        if (md > 0) {
            l = 8 - md;
        }
        StringBuilder sb = new StringBuilder(str);
        while (l > 0) {
            sb.append("0");
            l--;
        }
        String s = sb.toString();
        // System.out.println(s);

        int count = n / 8 + ((md > 0) ? 1 : 0);
        for (int i = 0; i < count; i++) {
            int start = i * 8;
            int end = start + 8;
            // System.out.println("start " + start);
            // System.out.println("end " + end);
            System.out.println(s.substring(start, end));
        }
    }

    private static void solution(String str1) {
        for (int i = 0; i <= str1.length(); i++) {
            if (i % 8 == 0 && i != 0) {
                String s1 = str1.substring(i - 8, i);
                System.out.println(s1);
            }
            if (i == str1.length() && i % 8 != 0) {
                String s2 = str1.substring(i - str1.length() % 8, i);
                for (int t = 0; t < 8 - str1.length() % 8; t++) {
                    s2 += "0";
                }
                System.out.println(s2);
            }
        }
    }

}
