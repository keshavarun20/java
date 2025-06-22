package Recursion;

public class Triangle1 {
    public static void main(String[] args) {
        //pat1(4,0);
        pat2(4,0);
    }

    static void pat1(int row, int col){
        if (row == 0) return;
        if (col < row){
            System.out.print("*" + " ");
            pat1(row, col + 1); // move right
        } else {
            System.out.println();
            pat1(row - 1, 0);
        }
    }

    static void pat2(int row, int col){
        if (row == 0 ) return;
        if (col < row){
            pat2(row, col + 1);
            System.out.print("*" + " ");
        } else {
            pat2(row - 1, 0);
            System.out.println();
        }
    }
}
