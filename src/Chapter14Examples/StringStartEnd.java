package Chapter14Examples;

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};
        //test method startsWith
        for (String string: strings) {
            if (string.startsWith("st")){
                System.out.printf("\"%S\" starts with \"st\"%n", string);
            }
        }
        System.out.println();

        for (String string : strings) {
            if (string.endsWith("ed")){
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
            }

        }
    }

}
