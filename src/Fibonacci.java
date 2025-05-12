import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =0, b=1;
        int count =2;
        int n = input.nextInt();
        while (count<=n){
            int c = a+b;
            a=b;
            b=c;

            count ++ ;
        }

        System.out.println(b);
    }
}
