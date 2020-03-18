/**
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/16 1:35 下午
 */
public class 零矩阵 {
    public static void main(String[] args) {

        int[][] matrx = new int[4][3];
        matrx[0][0] = 1;
        matrx[0][1] = 0;
        matrx[0][2] = 3;
        matrx[1][0] = 4;
        matrx[1][1] = 5;
        matrx[1][2] = 6;
        matrx[2][0] = 7;
        matrx[2][1] = 8;
        matrx[2][2] = 9;
        matrx[3][0] = 2;
        matrx[3][1] = 4;
        matrx[3][2] = 0;

        matrx = new int[][]{
                {0,0,0,5},
                {4,3,1,4},
                {0,1,1,4},
                {1,2,1,3},
                {0,0,1,1}
        };

        setZeroes(matrx);
    }

    public static void setZeroes(int[][] matrix) {
        // System.out.println(matrix.length);
        // System.out.println(matrix[0].length);

        int row[] = new int[matrix.length * matrix[0].length];
        int col[] = new int[matrix.length * matrix[0].length];
        for (int i = 0; i < row.length; i++) {
            row[i] = -1;
        }

        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }

        int ki = 0;
        int kj = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[ki++] = i;
                    col[kj++] = j;
                }
            }
        }

        show(matrix, row, col);
    }

    private static void show(int matrix[][], int row[], int col[]) {

        // for (int i = 0; i < row.length; i++) {
        //     System.out.print(row[i] + " ");
        // }
        // // System.out.println();
        // for (int i = 0; i < col.length; i++) {
        //     System.out.print(col[i] + " ");
        // }
        // // System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                boolean b = find(i, j, row, col);
                // System.out.print(b + " ");
                if (b) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);

                if (j != matrix[0].length - 1) {
                    System.out.print(",");
                }
            }
            if (i == matrix.length - 1) {
                System.out.println("]");
            } else {
                System.out.println("],");
            }
        }
        System.out.println("]");
    }

    public static boolean find(int i, int j, int row[], int col[]) {
        int index = -1;
        for (int k = 0; k < row.length; k++) {
            if (i == row[k]) {
                index = k;
                break;
            }
        }
        if(index == -1){
            for (int k = 0; k < col.length; k++) {
                if (j == col[k]) {
                    index = k;
                    break;
                }
            }
        }
        return index == -1 ? false : true;
    }

}
