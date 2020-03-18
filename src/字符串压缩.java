import java.util.Scanner;

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 * <p>
 * 示例1:
 * <p>
 * 输入："aabcccccaaa"
 * 输出："a2b1c5a3"
 * 示例2:
 * <p>
 * 输入："abbccd"
 * 输出："abbccd"
 * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 * 提示：
 * <p>
 * 字符串长度在[0, 50000]范围内。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/compress-string-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/16 8:49 上午
 */
public class 字符串压缩 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String s = compressString(str);
        System.out.println(s);
    }

    public static String compressString(String s) {
        String result = "";
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            String substring = s.substring(i, i + 1);
            if (i == 0) {
                result += substring;
                count++;
            } else {
                if (substring.equals(s.substring(i - 1, i))) {
                    count++;
                } else {
                    result += count + substring;
                    count = 1;
                }
            }
        }
        result += count;

        // 若“压缩”后的字符串没有变短，则返回原先的字符串
        if(result.length()>=len){
            result = s;
        }

        return result;
    }
}
