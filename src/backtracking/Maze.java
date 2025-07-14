package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        System.out.println(path("",3,3));

        boolean[][] board = {{true,true,true},{true,true,true},{true,true,true}};
//
//        pathWithRiver("",board,0,0);
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("",board,0,0,path,1);

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


    static void pathWithRiver(String p,boolean[][] maze,int r,int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        if (r < maze.length-1) {
            pathWithRiver(p + 'D', maze, r+1, c );
        }

        if (c< maze[0].length-1){
            pathWithRiver(p + 'R', maze, r, c+1 );
        }
    }

    static void AllPaths(String p,boolean[][] maze,int r,int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        maze[r][c] = false;

        if (r < maze.length-1) {
            AllPaths(p + 'D', maze, r+1, c );
        }

        if (c< maze[0].length-1){
            AllPaths(p + 'R', maze, r, c+1 );
        }
        if (r>0){
            AllPaths(p + 'U', maze, r-1, c );
        }
        if (c>0){
            AllPaths(p + 'L', maze, r, c-1 );
        }

        maze[r][c] = true;
    }

    static void allPathPrint(String p,boolean[][] maze,int r,int c,int[][] path, int step){
        if (r == maze.length-1 && c == maze[0].length-1){
            path[r][c]=step;
            for (int [] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) return;

        maze[r][c] = false;
        path[r][c] =step;

        if (r < maze.length-1) {
            allPathPrint(p + 'D', maze, r+1, c,path,step+1);
        }

        if (c< maze[0].length-1){
            allPathPrint(p + 'R', maze, r, c+1,path,step+1);
        }
        if (r>0){
            allPathPrint(p + 'U', maze, r-1, c,path,step+1);
        }
        if (c>0){
            allPathPrint(p + 'L', maze, r, c-1,path,step+1);
        }

        maze[r][c] = true;
        path[r][c] =0;
    }

}
