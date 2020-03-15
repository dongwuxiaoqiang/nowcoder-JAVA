import java.util.Scanner;

/**
 * 题目描述
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * <p>
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 * <p>
 * 输出描述:
 * 输出合并后的键值对（多行）
 * <p>
 * 示例1
 * 输入
 * 复制
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出
 * 复制
 * 0 3
 * 1 2
 * 3 4
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 6:00 下午
 */
public class 合并表记录 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nn = new int[n];
        int[] hasV = new int[n];
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int v = scanner.nextInt();
            nn[k] = nn[k] + v;
            hasV[k] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (hasV[i] == 1) {
                System.out.println(i + " " + nn[i]);
            }
        }
    }
}
