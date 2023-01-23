package Chapter15.nonBlockingIOPaths;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        Path  currentDirectory = Paths.get("").toAbsolutePath();
        System.out.println(currentDirectory);
        Path target = Paths.get("C:\\Users\\user\\IdeaProjects\\javaProjectExer\\src\\Chapter15\\formatter\\Example.java");
        Path relative = currentDirectory.relativize(target);
        System.out.println(relative);
        //System.out.println(currentDirectory.getFileSystem());

        System.out.println(relative.getFileName());
        System.out.println("is directory:: "+ Files.isDirectory(relative));
        System.out.println("Exists:: "+Files.exists(relative));

    }

}

