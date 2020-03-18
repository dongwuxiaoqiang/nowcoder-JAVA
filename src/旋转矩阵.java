/**
 * 给定一幅由N × N矩阵表示的图像，其中每个像素的大小为4字节，编写一种方法，将图像旋转90度。
 * <p>
 * 不占用额外内存空间能否做到？
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-matrix-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/16 9:08 上午
 */
public class 旋转矩阵 {
    public static void main(String[] args) {
        int[][] matrx = new int[3][3];
        matrx[0][0] = 1;
        matrx[0][1] = 2;
        matrx[0][2] = 3;
        matrx[1][0] = 4;
        matrx[1][1] = 5;
        matrx[1][2] = 6;
        matrx[2][0] = 7;
        matrx[2][1] = 8;
        matrx[2][2] = 9;

        rotate(matrx);
    }

    public static void rotate(int[][] matrix) {
        int len = matrix.length;
        int m[][] = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= 0; j--) {
                m[i][len - (j + 1)] = matrix[j][i];

                // int temp = matrix[i][len - (j + 1)];
                // matrix[i][len - (j + 1)] = matrix[j][i];
                // matrix[j][i] = temp;
            }
        }
        // System.out.println(m);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j] = m[i][j];
            }
        }

        show(matrix, len);
    }

    public static void show(int m[][], int len) {
        System.out.println("[");
        for (int i = 0; i < len; i++) {
            System.out.print("[");
            for (int j = 0; j < len; j++) {
                System.out.print(m[i][j]);

                if (j != len - 1) {
                    System.out.print(",");
                }
            }
            if (i != len - 1) {
                System.out.println("],");
            } else {
                System.out.println("]");
            }
        }
        System.out.println("]");
    }
}
