package Chapter14Examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args){
        Pattern expression = Pattern.compile("J.\\d[0-35-9]-\\d\\d-\\d\\d");
        Matcher matcher = expression.matcher("""
                Jane's Birthday is 05-12-75
                Dave's Birthday is 11-04-68
                John's Birthday is 04-28-73
                Joe's Birthday is 12-17-77
                """);
        while (matcher.find()){
            System.out.println("MATCHES-> "+matcher.group());
        }

    }
}
