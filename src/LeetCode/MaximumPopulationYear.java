package LeetCode;

public class MaximumPopulationYear {

    public static void main(String[] args) {
        int[][] logs= { {1993, 1999}, {2000, 2010} };

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            for (int year = birth; year < death; year++) {
                // process the year when the person is alive
                System.out.println(year);
            }
        }
    }
}
