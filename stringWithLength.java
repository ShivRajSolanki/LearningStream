import java.util.*;
import java.util.stream.Collectors;

public class stringWithLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Shivraj", "Riya", "Bhavya");
        Set<String> st = list.stream().map(s ->s +"="+s.length()).collect(Collectors.toSet());
        System.out.println(st);
    }
}
