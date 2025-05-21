package BinarySearch;

import java.util.Arrays;

public class RowColumnMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11}
        };

        System.out.println(Arrays.toString(search(matrix,9)));
    }

    static int[] search(int[][] matrix, int target){
        int r =0;
        int c =matrix[0].length-1;

        while(r< matrix.length && c>=0){
            if (matrix[r][c] == target) return new int[]{r,c};
            if (matrix[r][c] > target) c--;
            else r++;
        }

        return new int[]{-1,-1};
    }
}
