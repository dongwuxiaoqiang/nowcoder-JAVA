import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述
 * 牛牛总是睡过头，所以他定了很多闹钟，只有在闹钟响的时候他才会醒过来并且决定起不起床。从他起床算起他需要X分钟到达教室，上课时间为当天的A时B分，请问他最晚可以什么时间起床
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含一个正整数，表示闹钟的数量N(N<=100)。
 * 接下来的N行每行包含两个整数，表示这个闹钟响起的时间为Hi(0<=A<24)时Mi(0<=B<60)分。
 * 接下来的一行包含一个整数，表示从起床算起他需要X(0<=X<=100)分钟到达教室。
 * 接下来的一行包含两个整数，表示上课时间为A(0<=A<24)时B(0<=B<60)分。
 * 数据保证至少有一个闹钟可以让牛牛及时到达教室。
 * 输出描述:
 * 输出两个整数表示牛牛最晚起床时间。
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 10:47 上午
 */
public class 牛牛的闹钟 {
    static class Naoling {
        private int h;
        private int m;
        private String s;

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public int getM() {
            return m;
        }

        public void setM(int m) {
            this.m = m;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "Naoling{" +
                    "h=" + h +
                    ", m=" + m +
                    ", s='" + s + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        SimpleDateFormat sdfAll = new SimpleDateFormat("yyyy-MM-dd");
        String ymd = sdfAll.format(System.currentTimeMillis());
        // System.out.println(ymd);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Naoling> naolingList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            Naoling naoling = new Naoling();
            naoling.setH(h);
            naoling.setM(m);
            naoling.setS(ymd + " " + h + ":" + m);
            naolingList.add(naoling);
        }
        // System.out.println(naolingList);
        int needTime = scanner.nextInt();
        // System.out.println("上课路程 " + needTime);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        // System.out.println("A = " + A + ", B = " + B);
        String sk = ymd + " " + A + ":" + B;
        // System.out.println("上课时间 sk =  " + sk);
        long skTime = 0;
        try {
            skTime = sdf.parse(sk).getTime();
            // System.out.println("skTime = " + skTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long[] tt = new long[naolingList.size()];
        try {
            for (int i = 0; i < naolingList.size(); i++) {
                Naoling naoling = naolingList.get(i);
                long naolingTime = sdf.parse(naoling.getS()).getTime();
                // System.out.println("naolingTime = " + naolingTime);
                // 时间差值 分钟
                long t = (skTime - naolingTime) / 1000 / 60;
                // System.out.println("上课时间和起床时间差值 " + t);
                tt[i] = t;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int index = 0;
        long minChazhiTime = tt[index] - needTime;
        for (int i = 1; i < tt.length; i++) {
            long ts = tt[i] - needTime;
            if (ts < 0) {
                continue;
            }
            if (ts < minChazhiTime) {
                minChazhiTime = tt[i] - needTime;
                index = i;
            }
        }
        // System.out.println("index = " + index);
        System.out.println(naolingList.get(index).getH() + " " + naolingList.get(index).getM());
    }
}
