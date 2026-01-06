import java.util.*;
import java.util.stream.Collectors;

public class removeEmptyString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shivraj", "", "Riya", "");

        List<String>complete = names.stream().filter(n-> !n.isEmpty()).collect(Collectors.toList());
        System.out.println(complete);
    }
    
}
