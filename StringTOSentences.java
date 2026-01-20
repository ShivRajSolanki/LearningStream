import java.util.*;
import java.util.stream.Collectors;


public class StringTOSentences {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "is", "awesome");

        String result = list.stream()
                            .collect(Collectors.joining(" "));

        System.out.println(result); 
    }
}
