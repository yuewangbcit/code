package code.java101.scanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Demonstrates the use of Scanner to read file input and parse it using
 * alternative delimiters.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class URLDissector {

    /**
     * Reads URLs from a file and prints their path components.
     *
     * @param args command line arguments (unused)
     * @throws IOException if there is an error reading the file
     */
    public static void main(String[] args) throws IOException {
        final Scanner fileScan =
                new Scanner(new File("src/code/java101/scanner/urls.inp"));

        // An approach to reads and process each line of a file
        while (fileScan.hasNext()) {

            String url = fileScan.nextLine();
            System.out.println("URL: " + url);

            Scanner urlScan = new Scanner(url);
            urlScan.useDelimiter("/");

            // Prints each part of the url
            while (urlScan.hasNext()) {
                System.out.println("   " + urlScan.next());
            }
            System.out.println();
        }

        fileScan.close();

        // Another approach to reads and process each line of a file
        Path alternateFileScan = Paths.get("src/code/java101/scanner/urls.inp");
        String contents = Files.readString(alternateFileScan);
        System.out.println(contents);

    }
}

