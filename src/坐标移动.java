import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * 题目描述
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 * <p>
 * 输入：
 * <p>
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 * <p>
 * 坐标之间以;分隔。
 * <p>
 * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 * <p>
 * 下面是一个简单的例子 如：
 * <p>
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * <p>
 * 处理过程：
 * <p>
 * 起点（0,0）
 * <p>
 * +   A10   =  （-10,0）
 * <p>
 * +   S20   =  (-10,-20)
 * <p>
 * +   W10  =  (-10,-10)
 * <p>
 * +   D30  =  (20,-10)
 * <p>
 * +   x    =  无效
 * <p>
 * +   A1A   =  无效
 * <p>
 * +   B10A11   =  无效
 * <p>
 * +  一个空 不影响
 * <p>
 * +   A10  =  (10,-10)
 * <p>
 * 结果 （10， -10）
 * <p>
 * 注意请处理多组输入输出
 * <p>
 * 输入描述:
 * 一行字符串
 * <p>
 * 输出描述:
 * 最终坐标，以,分隔
 * <p>
 * 示例1
 * 输入
 * 复制
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * 输出
 * 复制
 * 10,-10
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/16 6:23 下午
 */
public class 坐标移动 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            show(str);
        }
        in.close();

    }

    public static void show(String str) {
        String[] arr = str.split(";");
        String reg = "[A|D|W|S]\\d{1,2}";

        int x = 0;
        int y = 0;

        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                continue;
            }
            // System.out.println("-->" + arr[i]);
            boolean isMatch = Pattern.matches(reg, arr[i]);
            // System.out.println(isMatch);
            if (!isMatch) {
                continue;
            }
            // System.out.println("-->" + arr[i]);
            int v = Integer.valueOf(arr[i].replaceAll("[A|W|D|S|Z]", ""));
            // System.out.println("v = " + v);
            String firtStr = arr[i].substring(0, 1);
            // System.out.println(firtStr);

            if (firtStr.equals("A")) {
                x = x - v;
            } else if (firtStr.equals("D")) {
                x = x + v;
            } else if (firtStr.equals("W")) {
                y = y + v;
            } else if (firtStr.equals("S")) {
                y = y - v;
            }
            // System.out.println("x = " + x + ", y = " + y);

            b = true;
        }
        if (b) {
            System.out.println(x + "," + y);
        }
    }


}
