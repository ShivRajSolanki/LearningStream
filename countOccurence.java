import java.util.*;
import java.util.stream.Collectors;

public class countOccurence{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Apple");
        Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(w->w, Collectors.counting()));
        System.out.println(wordCount);
    }
}