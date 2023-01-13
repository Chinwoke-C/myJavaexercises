package Chapter8;

import java.util.Arrays;
//
// TODO: 1/10/2023  //8.17 (HugeInteger Class) Create a class HugeInteger which uses a 40-element array of digits to
//        store integers as large as 40 digits each. Provide methods parse, toString, add and subtract. Method
//        parse should receive a String, extract each digit using method charAt and place the integer
//        equivalent of each digit into the integer array. For comparing HugeInteger objects, provide the following
//        methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
//        and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
//        holds between the two HugeInteger objects and returns false if the relationship does not hold. Provide
//        a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
//        remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false” with
//        format specifier %b.]
//public class HugeInteger {
//    int[] fortyElements = new int[40];
//    public static void main(String[] args) {
//        int [] elements = {5, 0, 0, 0};
//    int[] array = parse("5000",elements);
//        System.out.println(Arrays.toString(array));
//
//    }

//    public static void main(String[] args) {
////        HugeInteger myNum = new HugeInteger("567");
//        HugeInteger myNum = HugeInteger.parse("567");
//        System.out.println(myNum);
//    }
//
//    public HugeInteger(String digits){
//        String[] digitsArray = digits.split("");
//
//    }
//
//    public static HugeInteger parse(String digits){
//
//
//
//       return new HugeInteger(digits);
//    }
//
//    public static String toString(int[] a) {
//        if (a == null)
//            return "null";
//        int iMax = a.length - 1;
//        if (iMax == -1)
//            return "[]";
//
//        StringBuilder b = new StringBuilder();
//        b.append('[');
//        for (int i = 0; ; i++) {
//            b.append(a[i]);
//            if (i == iMax)
//                return b.append(']').toString();
//            b.append(", ");
//        }
//    };
//
//}