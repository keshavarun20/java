package BinarySearch;

import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1},
                {3},
        };
        System.out.println(Arrays.toString(search(matrix,2)));
    }

    // Search in the row provided simple Binary Search
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;

            if(matrix[row][mid] == target) return new int[] {row,mid};
            if (matrix[row][mid] > target) cEnd =mid-1;
            else cStart=mid+1;
        }

        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows= matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
        return binarySearch(matrix,0,0,cols-1,target);
        }
        if (cols == 1) {
            int top = 0, bottom = rows - 1;
            while (top <= bottom) {
                int mid = top + (bottom - top) / 2;
                if (matrix[mid][0] == target) return new int[] {mid, 0};
                if (matrix[mid][0] < target) top = mid + 1;
                else bottom = mid - 1;
            }
            return new int[] {-1, -1};
        }

        // run the loop still 2 rows are remaining
        int rStart =0;
        int rEnd =rows-1;
        int cMid = cols/2;
        while(rStart != rEnd -1){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid] == target) return new int[] {mid,cMid};
            if (matrix[mid][cMid] > target) rEnd =mid;
            else rStart = mid;
        }

        //now we have 2 rows
        //checking whether target in the mid-column
        if(matrix[rStart][cMid] == target) return new int[] {rStart,cMid};
        if(matrix[rStart + 1][cMid] == target) return new int[] {rStart+1,cMid};

        //otherwise search in
        //the 1st half
        if (target <= matrix[rStart][cMid-1]) return binarySearch(matrix,rStart,0,cMid-1,target);
        //the 2nd half
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1] ) return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        //the 3rd half
        if (target <= matrix[rStart+1][cMid-1]) return binarySearch(matrix,rStart+1,0,cMid-1,target);
        //the 4th half
        else return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
    }
}
