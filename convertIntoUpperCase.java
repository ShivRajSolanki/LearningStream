import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class convertIntoUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("shivraj", "riya", "Bhavya");
        
        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperNames);

    }
}
