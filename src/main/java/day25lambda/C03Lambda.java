package day25lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class C03Lambda {

    public static void main(String[] args) throws IOException {

        //How to access to a file
        Files.lines(Paths.get("src/main/java/day25lambda/MyTextFile.txt")).forEach(System.out::println);

        //Convert all characters to uppercase and sort the lines in natural order
        Files.
                lines(Paths.get("src/main/java/day25lambda/MyTextFile.txt")).
                map(String::toUpperCase).
                sorted().
                forEach(System.out::println);
        //Print the lines contain Java.
        Files.
                lines(Paths.get("src/main/java/day25lambda/MyTextFile.txt")).
                filter(t->t.contains("Java")).
                forEach(System.out::println);
        //Print the distinct words in the text file
        Files.
                lines(Paths.get("src/main/java/day25lambda/MyTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("\\p{Punct}", "")).
                distinct().
                forEach(System.out::println);
        //Print the words end with "s", distinctly, in uppercase and in alphabetical order.
        Files.
                lines(Paths.get("src/main/java/day25lambda/MyTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("s")).
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(System.out::println);
        //Find the total number of letters used in the text file
        int numOfChar = Files.
                lines(Paths.get("src/main/java/day25lambda/MyTextFile.txt")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.length()).
                reduce(Math::addExact).
                get();
        System.out.println(numOfChar);
    }
}