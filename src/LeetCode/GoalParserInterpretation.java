package LeetCode;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command="G()(al)";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <command.length() ; i++) {
            if (command.charAt(i) == 'G') {
                result.append('G'); i++;
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                result.append('o');
                i+=2;
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)=='a'&& command.charAt(i+2)=='l'&& command.charAt(i+3)==')'){
                result.append('a');
                result.append('l');
                i+=4;
            }
        }

        System.out.println(result);
    }
}
