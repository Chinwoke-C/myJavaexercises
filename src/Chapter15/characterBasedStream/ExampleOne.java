package Chapter15.characterBasedStream;

import org.junit.platform.commons.logging.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.platform.commons.logging.Logger;
public class ExampleOne {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ExampleOne.class);
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "C:\\Users\\user\\IdeaProjects\\javaProjectExer\\src\\Chapter15\\byteBased\\test.txt"))){
            System.out.print("data from file::"+ bufferedReader.readLine());
        } catch (IOException e) {
//            System.err.println("exception message"+e.getMessage());
            logger.error(()->e.getMessage());
        }
    }
}
