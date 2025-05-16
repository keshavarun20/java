package LeetCode;

import java.util.Arrays;

public class ReshapetheMatrix {

    public static void main(String[] args) {
        int[][] mat ={{1,2},{3,4}};
        int m =mat.length;
        int n = mat[0].length;
        int r=1;
        int c=4;
        int[][] ans =new int[r][c];

        if(m*n==r*c){
            for (int i = 0; i <m ; i++) {
                for (int j = 0; j <n ; j++) {
                    int index = i * n + j;         // 0 to 3
                    int row = index / c;           // new row in ans
                    int col = index % c;           // new column in ans
                    ans[row][col] = mat[i][j];
                }

            }
        } else System.out.println(Arrays.deepToString(mat));
        System.out.println(Arrays.deepToString(ans));
    }
}
