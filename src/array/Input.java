package array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];

        String[] str = new String[4];


//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = input.nextInt();
//        }

        for (int i = 0; i <str.length ; i++) {
            str[i] = input.next ();
        }


        System.out.println(Arrays.toString(str));

        str[1] = "keshav";

        System.out.println(Arrays.toString(str));
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
    }
}
