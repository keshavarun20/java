package LinearSearch;

public class StringSearch {


    public static void main(String[] args) {
        String str = "keshav";
        char target = 'd';
        System.out.println(search(str,target));
    }

    static boolean search(String str, char target){
        if(str.isEmpty()) return false;

        for (int i = 0; i <str.length() ; i++) {
            if (target == str.charAt(i)) return true;
        }

        return false;
    }
}
