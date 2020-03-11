import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 10:44 上午
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s != null && !s.equals("")) {
            String[] arr = s.split(" ");
            String lastStr = arr[arr.length - 1];
            lastStr = lastStr.replaceAll(" ", "");
            System.out.println(lastStr.length());
        }
    }
}
