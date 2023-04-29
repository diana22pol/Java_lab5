import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement {
    public String result;
    public String replaceHotLine(String input) {

        String pattern = "0\\s?\\(?800\\)?\\s?\\d{3}\\s?\\d{3}";
        String replacement = "HOT_LINE";

        Pattern p = Pattern.compile(pattern);

        Matcher matcher = p.matcher(input);
        result = matcher.replaceAll(replacement);
        return result;
    }

    static public void main(String[] args){
        Replacement main = new Replacement();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(main.replaceHotLine(input));
    }
}