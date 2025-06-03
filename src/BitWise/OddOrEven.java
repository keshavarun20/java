package BitWise;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(27);
    }
    static void oddOrEven(int n){
        if((n&1)==1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
