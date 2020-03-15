import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * <p>
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * <p>
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * <p>
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * <p>
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * <p>
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 * <p>
 * 说明：
 * <p>
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "42"
 * 输出: 42
 * 示例 2:
 * <p>
 * 输入: "   -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 *      我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/15 4:48 下午
 */
public class 字符串转换整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int result = myAtoi(str);
        System.out.println(result);
    }

    public static int myAtoi(String str) {
        // System.out.println(Integer.valueOf('+'));
        // System.out.println(Integer.valueOf('-'));
        // System.out.println(Integer.valueOf('0'));
        // System.out.println(Integer.valueOf('9'));
        // 45 48 57

        int spaceIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                break;
            }
            spaceIndex = i + 1;
        }
        // System.out.println("spaceIndex = " + spaceIndex);

        int index = -1;
        String s = "";
        for (int i = spaceIndex; i < str.length(); i++) {
            // String substring = str.substring(i, i + 1);
            // System.out.println(substring);

            char c = str.charAt(i);
            Integer ascii = Integer.valueOf(c);
            // System.out.println(ascii);
            // 正负、数字
            if (ascii == 43 || ascii == 45 || (ascii >= 48 && ascii <= 57)) {
                if (index == -1) {// 第一个  + - 0-9
                    s += String.valueOf(c);
                    index++;
                } else {// 非第一个有用字符
                    if (c == '+' || c == '-') {
                        break;
                    } else {
                        s += String.valueOf(c);
                        index = i;
                    }
                }
            } else {
                break;
            }
        }

        if (index == -1) {
            return 0;
        }

        // System.out.println(s);
        if (s.equals("+") || s.equals("-")) {
            return 0;
        }

        int result = 0;
        if (s.substring(0, 1).equals("-")) {
            spaceIndex = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(spaceIndex) != '0') {
                    break;
                }
                spaceIndex = i;
            }
            s = s.substring(spaceIndex, s.length());
            // System.out.println(s);

            if (s.equals("")) {
                result = 0;
            } else {
                s = "-" + s;
                // 负数
                if (s.length() > 11) {
                    result = Integer.MIN_VALUE;
                } else {
                    Long v = Long.valueOf(s);
                    if (v < Integer.MIN_VALUE) {
                        result = Integer.MIN_VALUE;
                    } else {
                        result = v.intValue();
                    }
                }
            }
        } else if (s.substring(0, 1).equals("+")) {
            spaceIndex = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(spaceIndex) != '0') {
                    break;
                }
                spaceIndex = i;
            }
            s = s.substring(spaceIndex, s.length());
            // System.out.println(s);

            if (s.equals("")) {
                result = 0;
            } else {
                s = "+" + s;
                // 正数
                if (s.length() > 11) {
                    result = Integer.MAX_VALUE;
                } else {
                    Long v = Long.valueOf(s);
                    if (v > Integer.MAX_VALUE) {
                        result = Integer.MAX_VALUE;
                    } else {
                        result = v.intValue();
                    }
                }
            }
        } else {
            spaceIndex = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(spaceIndex) != '0') {
                    break;
                }
                spaceIndex = i;
            }
            s = s.substring(spaceIndex, s.length());
            // System.out.println(s);

            if (s.equals("")) {
                result = 0;
            } else {
                // 正数
                if (s.length() > 10) {
                    result = Integer.MAX_VALUE;
                } else {
                    Long v = Long.valueOf(s);
                    if (v > Integer.MAX_VALUE) {
                        result = Integer.MAX_VALUE;
                    } else {
                        result = v.intValue();
                    }
                }
            }
        }
        // System.out.println(s);
        return result;
    }
}
