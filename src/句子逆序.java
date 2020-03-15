import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 7:38 下午
 */
public class 句子逆序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        reverse(s);
    }

    public static void reverse(String sentence) {
        String[] arr = sentence.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
