package BitWise;

public class PowerTwoOrNot {
    public static void main(String[] args) {
        System.out.println(isPowerOFTwo(0));
    }

    static boolean isPowerOFTwo(int n){
        return n> 0 && n == Integer.highestOneBit(n);
        //return n> 0 && (n&(n-1)) ==0;
    }
}
