package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippinganImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};



        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[i].length - 1;

            while (start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }

            for (int j=0; j<image[i].length;j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }


        System.out.println(Arrays.deepToString(image));
    }
}
