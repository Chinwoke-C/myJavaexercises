package Chapter15.printWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Example {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter("ameerah.txt")){
            writer.print("Ameerah haf join bad gang ");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
