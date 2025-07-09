package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        System.out.println(pathDiagonal("",3,3));
    }

    static int count(int r , int c){
        if (r ==1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right =count(r,c-1);

        return left + right;
    }

    static ArrayList<String> path(String p, int r , int c){
        if (r ==1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list =new ArrayList<>();
        if (r > 1) {
            list.addAll(path(p+"D",r-1,c));
        }
        if (c>1){
            list.addAll(path(p + "R",r,c-1));
        }

        return list;
    }

    static ArrayList<String> pathDiagonal(String p, int r , int c){
        if (r ==1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list =new ArrayList<>();
        if (r > 1) {
            list.addAll(pathDiagonal(p+"V",r-1,c));
        }
        if (c>1){
            list.addAll(pathDiagonal(p + "H",r,c-1));
        }
        if (r >1 && c>1){
            list.addAll(pathDiagonal(p + "D",r-1,c-1));
        }

        return list;
    }

}
