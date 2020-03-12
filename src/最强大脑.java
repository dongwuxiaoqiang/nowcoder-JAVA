import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/12 11:22 上午
 */
public class 最强大脑 {
    public static void main(String[] args) throws IOException {
        // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // String all = bf.readLine();
        // String first = bf.readLine();
        // String last = bf.readLine();

        Scanner scanner = new Scanner(System.in);
        String all = scanner.nextLine();
        String first = scanner.nextLine();
        String last = scanner.nextLine();

        boolean forward = false;
        boolean backward = false;

        String regs = ".*" + first + ".*" + last + ".*";
        if (all.matches(regs)) {
            forward = true;
        }

        StringBuilder sb = new StringBuilder(all);
        if (sb.reverse().toString().matches(regs)) {
            backward = true;
        }

        if (forward && backward) {
            System.out.println("both");
        } else if (forward && !backward) {
            System.out.println("forward");
        } else if (!forward && backward) {
            System.out.println("backward");
        } else if (!forward && !backward) {
            System.out.println("invalid");
        }
    }
}
