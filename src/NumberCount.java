public class NumberCount {
    public static void main(String[] args) {
        System.out.println("b1b2b3b4");
        System.out.println(countNum("b1b2b3b4"));
    }
    public  static int countNum(String string){
     int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i)>='0' && string.charAt(i) <= '9'){
                count++;
            }

        }

        return count;
    }
}
