package LeetCode;

public class FindNumberswithEvenNumberofDigits {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int count = 0;

        for(int element : arr){
            int digits = (int)(Math.log10(element) +1);
            if (digits%2 == 0) count++;
        }

        System.out.println(count);
    }
}
