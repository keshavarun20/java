package backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4; // You can change this to any N
        boolean[][] board = new boolean[n][n];
       queens(board, 0);
    }

    static int queens(boolean[][] board,int row){
        if (row == board.length){
            display(board);
            return 1;
        }

        int count =0;
        for (int col = 0; col <board.length ; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count =count+queens(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i <row ; i++) {
            if (board[i][col]){
                return false;
            }
        }

        //right diagonal
        int length = Math.min(board.length - col-1,row);
        for (int i = 1; i <= length; i++) {
            if (board[row-i][col+i]) {
                return false;
            }
        }

        //left diagonal
        int length2 = Math.min(row,col);
        for (int i = 1; i <=length2 ; i++) {
            if (board[row-i][col-i]) {
                return false;
            }
        }
        return true;

    }

    static void display(boolean[][] board){
        for (boolean[] row : board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

}
