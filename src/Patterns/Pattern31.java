package Patterns;

public class Pattern31 {
    public static void main(String[] args) {
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <7 ; j++) {
                int wall=Math.min(Math.min(i, j), Math.min(6- i, 6  - j));
                System.out.print((4-wall) + " ");
            }
            System.out.println();
        }
    }
}
