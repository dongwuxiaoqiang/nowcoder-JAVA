import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/16 4:50 下午
 */
public class 字符串轮转 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        boolean flipedString = isFlipedString(s1, s2);
        System.out.println(flipedString);
    }

    public static boolean isFlipedString(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }

        if(s1.length() == 0){
            return true;
        }

        int index = 1;
        for (int i = 0; i < s1.length(); i++) {
            String substring = s1.substring(0, index);
            // System.out.println(substring);

            if(s2.indexOf(substring)>=0){
                index++;
                continue;
            }else{
                break;
            }
        }
        // System.out.println(index);

        String ta = s1.substring(0,index -1);
        String tb = s1.substring(index-1,s1.length());
        // System.out.println(ta);
        // System.out.println(tb);
        // System.out.println(tb+ta);
        if(s2.equals(tb+ta)){
            return true;
        }
        return false;
    }
}
