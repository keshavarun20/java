import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        System.out.print("Enter numbers (0 to stop):");
        int num = input.nextInt();

        while(num!=0){
            if(num<0){
                negativeSum += num;
            } else if  (num%2 == 0){
                positiveEvenSum += num;
            }
           else {
                positiveOddSum += num;
            }
            num=input.nextInt();
        }

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);

    }


}
