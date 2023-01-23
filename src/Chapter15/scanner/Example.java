package Chapter15.scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\IdeaProjects\\javaProjectExer\\ameerah.txt")){
        Scanner scanner = new Scanner(fileInputStream);
        String input = scanner.nextLine();
            System.out.println("program read:: " + input);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
