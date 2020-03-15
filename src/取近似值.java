import java.util.Scanner;

/**
 * 题目描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * <p>
 * 输入描述:
 * 输入一个正浮点数值
 * <p>
 * 输出描述:
 * 输出该数值的近似整数值
 * <p>
 * 示例1
 * 输入
 * 复制
 * 5.5
 * 输出
 * 复制
 * 6
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 5:49 下午
 */
public class 取近似值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        // System.out.println(f);

        String s = String.valueOf(f);
        int pos = s.indexOf(".");
        String ss = "0" + s.substring(pos, s.length());
        // System.out.println(ss);
        f = Float.valueOf(ss) * 10.0f;
        // System.out.println(f);
        if (f < 5.0) {
            System.out.println(s.substring(0, pos));
        } else {
            String s2 = s.substring(0, pos);
            System.out.println(Integer.valueOf(s2) + 1);
        }
    }
}
