package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int s=4;s>i;s--){
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
