package Chapter15.characterBasedStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Example {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))) {
            System.out.println("Enter a string: ");
            String input = bufferedReader.readLine();// READS what is on the first line of the buffered reader
            System.out.print("digits:: ");
            for (int count = 0; count < input.length(); count++) {
                if (input.charAt(count) == '_') System.out.print((input.charAt(count+1) ));
                
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
    }

