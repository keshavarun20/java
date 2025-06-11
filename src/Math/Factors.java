package Math;

import java.util.ArrayList;
import java.util.Collections;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <=n ; i++) {
            if (n%i == 0) System.out.print(i + " ");
        }
        System.out.println();
        factors(20);
        System.out.println();
        factorsSorted(20);
    }

    static void factors(int n){
        for (int i = 1; i*i <=n ; i++) {
            if (n%i == 0) {
                if (n/i == i ) System.out.print(i + " ");
                else System.out.print(i + " " + n/i + " ");
            }
        }
    }

    static void factorsSorted(int n){
        ArrayList<Integer> list  = new ArrayList<>();
        for (int i = 1; i*i <=n ; i++) {
            if (n%i == 0) {
                if (n/i == i ) System.out.print(i + " ");
                else {
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for (int factor : list) {
            System.out.print(factor + " ");
        }
    }
}
