import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = isArmstrong(n);

        System.out.println(ans);
    }

    static boolean isArmstrong(int n){
        int originalNumber = n;
        int sum = 0;

        while (n != 0) {
            int base = n % 10;
            sum += base * base * base;
            n = n / 10;
        }

        return sum == originalNumber;
    }
}
