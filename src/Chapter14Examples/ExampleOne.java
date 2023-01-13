package Chapter14Examples;

public class ExampleOne {
    public static void main(String[] args) {
        String name = new String();
        byte item1 = Byte.parseByte("65");
        byte item2 = Byte.parseByte("100");
        byte item3 = Byte.parseByte("101");

        byte[] myByteArray = {item1, item2, item3};
        String myName = new String(myByteArray,  0, 3);
        System.out.println("str::"+myName);


        char[] charArray = {'a','b','c', 'd'};
        String mySchoolName = new String(charArray);
        System.out.println(mySchoolName);

        String secondName = new String("Martha");
        System.out.println(secondName);
    }
}
