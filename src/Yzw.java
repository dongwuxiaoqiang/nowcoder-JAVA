import java.util.*;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/11 9:01 上午
 */
public class Yzw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map map = new HashMap();
        for (int i = 0; i <= str.length() - 1; i++) {
            char alp = str.charAt(i);
            int ascii = Integer.valueOf(alp);
            if (ascii < 0 || ascii > 127) {
                continue;
            }
            map.put(ascii, ascii);
        }
        System.out.println(map.size());
    }
}