package LeetCode;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        int missing = cyclicSort(arr);;
        System.out.println(missing);
    }

    static int cyclicSort(int[] arr){
        int i=0;
        while( i<arr.length){
            int correct=arr[i];
            if (arr[i] != arr[correct] ){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else i++;
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return arr[i];
            }
        }

        return arr[arr.length-1];
    }
}
