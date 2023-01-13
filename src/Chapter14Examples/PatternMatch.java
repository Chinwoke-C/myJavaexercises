package Chapter14Examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("e.+?d");
        Matcher matcher = pattern.matcher("endangered species will end up dead");
        System.out.print("matcher matches given expressions: ->" +matcher.matches());

        while(matcher.find()){
            System.out.println("matcher-> " + matcher.group());
        }
        
    }
}
