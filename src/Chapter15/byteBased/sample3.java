package Chapter15.byteBased;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class sample3 {
    public static void main(String[] args) {
        byte[] bytes = new byte[50];
        try( var dis = new DataInputStream(System.in)){
            int numberOfBytesRead = dis.read(bytes);
            System.out.println("numberOfBytesRead:: "+numberOfBytesRead);
            System.out.println(Arrays.toString(bytes));
            for (byte b:bytes) {
                if (b!=0) System.out.print(Character.toString(b));

            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}

