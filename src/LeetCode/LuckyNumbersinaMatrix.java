package LeetCode;

import java.util.ArrayList;
import java.util.Optional;

public class LuckyNumbersinaMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        ArrayList<Integer> minimum = new ArrayList<>();
        ArrayList<Integer> maximum = new ArrayList<>();


        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minimum.add(min);
        }

        for (int i = 0; i < cols; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < rows; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            maximum.add(max);
        }

        Optional<Integer> minMax = minimum.stream().max(Integer::compareTo);
        Optional<Integer> maxMax = maximum.stream().max(Integer::compareTo);

        if (minMax.isPresent() && maxMax.isPresent()) {
            if (minMax.get() < maxMax.get()) {
                System.out.println(minMax.get());
            }
        }
    }
}
