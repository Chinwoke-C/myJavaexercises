package Chapter15.byteBased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\javaProjectExer\\src\\Chapter15\\byteBased\\temp.txt")){
            for (int i = 1; i <= 10; i++) {
                fileOutputStream.write(i);
            }
            try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\IdeaProjects\\javaProjectExer\\src\\Chapter15\\byteBased\\temp.txt")){
                int value;
                while ((value = fileInputStream.read()) != -1){
                    System.out.print(value + " ");
                }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
