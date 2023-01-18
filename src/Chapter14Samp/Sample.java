package Chapter14Samp;

public class Sample {
    public static void main(String[] args) {


    String text = """
            1. We are paragons
            2. I am a winner 365 days a year
            3. The devil is a liar
            4. There are 7 days in the week
            """;
    String digitWithinText = "";
    for (int counter = 0; counter < text.length(); counter++){
        char currentCharacter = text.charAt(counter);
        if (Character.isDigit(currentCharacter))
            digitWithinText+= currentCharacter;//string concatenation in loop is not  efficient

    }
        System.out.println(digitWithinText);

    StringBuilder stringBuilder = new StringBuilder();
        for (int counter = 0; counter < text.length(); counter++){
            char currentCharacter = text.charAt(counter);
            if (Character.isDigit(currentCharacter))
            stringBuilder.append(currentCharacter);

    }
        System.out.println("string builder ref ->  "+ stringBuilder);
        String digits = stringBuilder.toString();
        System.out.println("string ref-> "+digits);
}
}

