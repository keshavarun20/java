package Strings;

public class Performance {
    public static void main(String[] args) {
//        String series = "";
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            series = series + " " +ch; // series += ch
//        }
//        series.replace(" ", []);
//        System.out.println(series);

        //Efficient Way
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series.append(" ").append(ch);
        }
        System.out.println(series.toString().replace(" ", "[]"));

    }
}
