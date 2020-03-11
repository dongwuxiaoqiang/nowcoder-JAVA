import java.util.Scanner;

/**
 * 题目描述
 * 牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
 * 接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。
 * 输出描述:
 * 输出牛牛最后面向的方向，N表示北，S表示南，E表示东，W表示西。
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 10:47 上午
 */
public class 迷途的牛牛 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
        int n = scanner.nextInt();
        // 接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转
        String s = scanner.next();

        String r = count(n, s);
        System.out.println(r);
    }

    private static String count(int n, String s) {
        // 找到字符串中L和R的次数
        int i = 0;
        int countL = 0;
        int countR = 0;
        while (i < n) {
            String ss = String.valueOf(s.charAt(i));
            if (ss.equals("L")) {
                countL++;
            } else {
                countR++;
            }
            i++;
        }
        // System.out.println("countL = " + countL);
        // System.out.println("countR = " + countR);
        int count = countL % 4 - countR % 4;
        if (count < 0) {
            count = count + 4; // 把-1变成3
        }
        // System.out.println(count);  // R  LRR RRRRR
        String r = "N";
        if (count == 0) {
            r = "N";
        } else if (count == 1) {
            r = "W";
        } else if (count == 2) {
            r = "S";
        } else if (count == 3) {
            r = "E";
        }
        return r;
    }
}
