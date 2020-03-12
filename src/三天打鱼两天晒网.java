import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/12 8:59 上午
 */
public class 三天打鱼两天晒网 {

    public static boolean check(String str) {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sd.setLenient(false);
            sd.parse(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean match(String time) {
        String pattern = "\\d{4}-\\d{2}-\\d{2}";
        boolean isMatchDate = Pattern.matches(pattern, time);
        return isMatchDate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        // System.out.println(time);

        boolean isTime = check(time);
        // System.out.println("isTime = " + isTime);
        if (!isTime) {
            System.out.println("Invalid input");
            return;
        }

        boolean isMatch = match(time);
        // System.out.println("isMatch = " + isMatch);
        if (!isMatch) {
            System.out.println("Invalid input");
            return;
        }

        // 时间计算起点
        String oldTime = "1990-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 判断时间差值
        try {
            long timeL = sdf.parse(time).getTime();
            long timeO = sdf.parse(oldTime).getTime();
            if (timeL - timeO < 0) {
                System.out.println("Invalid input");
                return;
            }

            // 1990-01-01
            // 1990-01-05 相差5天 [0,1,2,3,4]
            long days = (timeL - timeO) / 1000 / 60 / 60 / 24;
            // System.out.println(days);

            long md = days % 5;// 0 1 2 3 4

            if (md >= 0 && md <= 2) {
                System.out.println("He is working");
            } else if (md == 3 || md == 4) {
                System.out.println("He is having a rest");
            }

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Invalid input");
        }
    }
}
