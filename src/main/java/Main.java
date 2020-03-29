import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "src/main/java/Test.txt";

        String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);
        content = content.toLowerCase();

        String[] words = content.split(" ");
        Arrays.sort(words);

        for (String word: words) {
            System.out.println(word);
        }
    }
}
