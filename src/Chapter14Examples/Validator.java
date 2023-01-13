package Chapter14Examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("889");
        System.out.println(matcher.find());
    }


    public static boolean validate(String text){
        Pattern pattern = Pattern.compile("^agent-00[1-9]+|^agent-[1-9]+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
