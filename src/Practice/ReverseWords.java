package Practice;

public class ReverseWords {

    public static String reverse(String userString) {
        String reversedString = "";
        int backwardCounter = userString.length()-1;
        while(backwardCounter != -1){
            reversedString += userString.charAt(backwardCounter--);
        }

        return reversedString;
    }


    public static String capitalFirst(String userString) {
        String firstLetter = (""+userString.charAt(0)).toUpperCase();
        String otherLetter = "";
        for (int i = 1; i < userString.length() ; i++) {
            otherLetter += userString.charAt(i);

        }
        return firstLetter +otherLetter.toLowerCase();
    }
}
