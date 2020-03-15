import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述:
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述:
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 * 示例1
 * 输入
 * 复制
 * 9
 * cap
 * to
 * cat
 * card
 * two
 * too
 * up
 * boat
 * boot
 * 输出
 * 复制
 * boat
 * boot
 * cap
 * card
 * cat
 * to
 * too
 * two
 * up
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 7:44 下午
 */
public class 字符串连接最长路径查找 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());

        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            list[i] = s;
        }

        Arrays.sort(list);
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }
    }
}
