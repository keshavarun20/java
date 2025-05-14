package LeetCode;

import java.util.Arrays;

public class CellswithOddValuesinaMatrix{
    public static void main(String[] args) {
        int[][] ans = new int[2][3];;
        int[][] indices = {{0,1}, {1,1}};
        int count =0;

        for (int[] index : indices) {
            for (int j = 0; j < 3; j++) {
                ans[index[0]][j]++;
            }
            for (int j = 0; j < 2; j++) {
                ans[j][index[1]]++;
            }
        }

        for (int[] an : ans) {
            for (int i : an) {
                if (i % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
