package LeetCode;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += mat[i][i];                 // primary diagonal
            if (i != n - 1 - i) {             // avoid double-counting middle element
                sum += mat[i][n - 1 - i];     // secondary diagonal
            }
        }

        System.out.println(sum);
    }
}
