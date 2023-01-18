package Chapter15.byteBased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Sample1 {
    public static void main(String[] args) {
        byte[] bytes = new byte[30];
       try{
           FileInputStream stream = new FileInputStream("C:\\Users\\user\\IdeaProjects\\javaProjectExer\\src\\Chapter15\\byteBased\\test.txt");
       stream.read(bytes);
           for (byte b : bytes) {
               if (Character.isLetterOrDigit(b)|| Character.isSpaceChar(b))
           System.out.print(Character.toString(b));

           }
            stream.close();
       } catch (IOException ex) {
           System.out.println(ex.getMessage());
       }
    }
}
