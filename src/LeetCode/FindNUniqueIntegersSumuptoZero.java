package LeetCode;

public class FindNUniqueIntegersSumuptoZero {

    public static void main(String[] args) {
        int n =5;
        int[] ans= new int[n];
        int d= -(n/2);

        if (n%2 != 0){
            for (int i=0; i<n; i++ ){
                ans[i] = d;
                d=d+1;
            }
        }else {
            for (int i = 0; i < n/2; i++) {
                ans[i] = -(n / 2) + i;
                ans[i + n / 2] = i + 1;
            }
        }
    }
}
