import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int n = input.nextInt();


        while (n>0){

            if ( n%2!= 0 ){
                count++;
            }
            n--;
        }

        System.out.println(count);
    }
}
