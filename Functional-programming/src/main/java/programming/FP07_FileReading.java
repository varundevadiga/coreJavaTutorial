package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FP07_FileReading {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("file.txt"))
                .filter(msg -> msg.equalsIgnoreCase("hiii"))
                .forEach(System.out::println);
    }
}
