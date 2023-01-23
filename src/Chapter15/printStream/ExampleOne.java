package Chapter15.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExampleOne {
    public static void main(String[] args) {
        // the PrintStream is used to point to another location to write to asides the terminal
       try(PrintStream printstream =  new PrintStream(
               "C:\\Users\\user\\IdeaProjects\\javaProjectExer\\src\\Chapter15\\byteBased\\test.txt")){
           printstream.println("Good girl");
       } catch (FileNotFoundException exception) {
           System.out.println(exception.getMessage());

       }
    }
}

