package LeetCode;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};

        System.out.println(binarySearch(letters,'a'));
    }

    static char binarySearch(char[] letters, char target){
        int s =0;
        int e= letters.length - 1;

        while(s<=e){
            int mid = s + (e - s) / 2;
            if (letters[mid] > target) e=mid - 1;
            else   s=mid + 1;

        }

        return letters[s % letters.length];

    }
}
