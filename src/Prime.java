import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        primeNumber(n);
    }

    static void primeNumber(int n){

        if (n <= 1) {
            System.out.println("Not a Prime Number");
        }

        for(int i =2; i<=Math.sqrt(n); i++){
            if (n % i == 0) {
                System.out.println("Not a Prime Number");
                return;
            }
        }

        System.out.println("Prime Number");

    }
}
