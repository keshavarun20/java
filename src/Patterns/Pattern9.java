package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int s=0;s<i;s++){
                System.out.print(" ");
            }
            for (int j = 0; j<2*(5-i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
