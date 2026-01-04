import java.util.*;
import java.util.stream.Collectors;
public class groupingStringByLength {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shivraj", "Riya", "Survesh");
        Map<Integer, List<String>> grouped = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}
