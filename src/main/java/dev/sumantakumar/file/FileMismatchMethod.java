package dev.sumantakumar.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMismatchMethod {
    public static void main(String[] args) throws IOException {
        Path file1 = Paths.get("src/main/resources/test1.txt");
        Path file2 = Paths.get("src/main/resources/test2.txt");
        Files.writeString(file1, "Hello World");
        Files.writeString(file2, "Hello World");
        long mismatch = Files.mismatch(file1, file2);
        System.out.println(mismatch);
        if(mismatch == -1L){
            System.out.println("Files contents Matched");
        }else {
            System.out.println("Files contents Not Matched");
        }


    }
}
