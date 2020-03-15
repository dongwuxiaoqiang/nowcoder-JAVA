import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 11:24 上午
 */
public class 字符串中有多少个IP组合 {
    public static ArrayList<String> ip(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> t = new ArrayList<>();
        dsf(result, s, 0, t);
        ArrayList<String> finalReslult = new ArrayList<>();
        for (ArrayList<String> l : result) {
            StringBuffer sb = new StringBuffer();
            for (String str : l) {
                sb.append(str + ".");
            }
            sb.setLength(sb.length() - 1);
            finalReslult.add(sb.toString());
        }
        return finalReslult;
    }

    public static void dsf(ArrayList<ArrayList<String>> result, String s, int start, ArrayList<String> t) {
        if (t.size() >= 4 && start != s.length()) {
            return;
        }
        if ((t.size() + s.length() - start + 1) < 4) {
            return;
        }
        if (t.size() == 4 && start == s.length()) {
            ArrayList<String> temp = new ArrayList<String>(t);
            result.add(temp);
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (start + i > s.length()) {
                break;
            }
            String sub = s.substring(start, start + i);
            if (i > 1 && s.charAt(start) == '0') {
                break;
            }
            if (Integer.valueOf(sub) > 255) {
                break;
            }
            t.add(sub);
            dsf(result, s, start + i, t);
            t.remove(t.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipStr = sc.nextLine();
        ArrayList<String> ips = ip(ipStr);
        System.out.println(ips);
    }
}
