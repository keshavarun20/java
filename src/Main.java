import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int answer = 0;

        int count = 0;

        while (n>0){
           answer = answer*10 +n%10;
           n = n/10;
        }

        System.out.println(answer);
    }

    }
