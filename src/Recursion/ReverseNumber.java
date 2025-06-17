package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1121));
    }

    static int reverse(int n, int sum) {
        if (n == 0) return sum;
        return reverse(n / 10, sum * 10 + n % 10);
    }

    static boolean isPalindrome(int n){
        return n == reverse(n,0);
    }

}
