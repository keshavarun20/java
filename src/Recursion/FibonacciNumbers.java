package Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fibFormula(50));
    }

    static int fib(int n){
        if (n==0||n==1) return n;
        return fib(n-1) + fib(n-2);
    }

    static int fibFormula(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;

        // Use double for calculation, then round to the nearest int
        double fibN = (Math.pow(phi, n)) / sqrt5;

        return (int) (fibN);
    }
}
