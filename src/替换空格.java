import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/12 10:12 上午
 */
public class 替换空格 {
    public static String replaceSpace(StringBuffer str) {
        // System.out.println(str);
        String s = str.toString();
        return s.replaceAll(" ", "%20");

        // StringBuffer sb = new StringBuffer();
        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     String ts = String.valueOf(c);
        //     // if (Integer.valueOf(c) == 32) {
        //     //     ts = "%20";
        //     // }
        //     // sb.append(ts);
        //     if(c == ' '){
        //         ts = "%20";
        //     }
        //     sb.append(ts);
        // }
        // return sb.toString();


        // if (str == null) {
        //     return null;
        // }
        // for (int i = 0; i < str.length(); i++) {
        //     char c = str.charAt(i);
        //     if (c == ' ') {
        //         str.replace(i, i + 1, "%20");
        //     }
        // }
        // String s = str.toString();
        // return s;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // sb.append("We are happy!");
        Scanner scanner = new Scanner(System.in);
        sb.append(scanner.nextLine());

        String s = replaceSpace(sb);
        System.out.println(s);
    }
}
