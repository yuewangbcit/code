package code.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Copy {
    public static void main(String[] args) {
        var input = Path.of("src/code/streams/input");
        var output = Path.of("src/code/streams/output");
        try {
            Files.copy(input, output);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}