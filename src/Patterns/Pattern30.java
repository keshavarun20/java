package Patterns;

public class Pattern30 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int s=5;s>i;s--){
                System.out.print("  ");
            }
            for (int j = i; j>=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j<=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
