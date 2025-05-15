package LeetCode;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transposed = new int[mat[0].length][mat.length];

        for (int i = 0; i < mat[0].length ; i++) {
            for (int j = 0; j <mat.length ; j++) {
                transposed[i][j] = mat[j][i];
            }
        }

        System.out.println(Arrays.deepToString(transposed));
        System.out.println(mat[0].length);
    }
}
