import java.util.Arrays;
import java.util.List;

public class longestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "java",
                "springboot",
                "microservices",
                "api",
                "hibernate"
        );

        String longestWord = words.stream()
                                  .max((a, b) -> a.length() - b.length())
                                  .orElse("");

        System.out.println("Longest word: " + longestWord);
    }
}
