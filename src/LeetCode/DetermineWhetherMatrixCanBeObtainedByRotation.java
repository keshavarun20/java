package LeetCode;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,1}, {1,0}};
        int[][] target = {{1,0}, {0,1}};

        for (int i = 0; i < mat.length; i++) {

            for (int j=0; j<mat[i].length;j++){
                mat[i][j] = mat[i][j] ^ 1;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            if (mat[i].length != target[i].length) System.out.println("false") ;

            for (int j=0; j<mat[i].length;j++){
                if(mat[i][j] != target[i][j]) System.out.println("false");;
            }
        }



        System.out.println("True");
    }
}
