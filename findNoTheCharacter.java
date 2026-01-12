import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class findNoTheCharacter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Shivraj", "Riya", "Bhavya", "Nishu");
        Set<Integer> st = list.stream().map(String::length).collect(Collectors.toSet());
        System.out.println(st);
    }
}
