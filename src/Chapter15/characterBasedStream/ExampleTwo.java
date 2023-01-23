package Chapter15.characterBasedStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ExampleTwo {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))){
            bufferedWriter.write("Intelli-Jerry");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
