import java.util.*;
public class filterString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shivraj", "Bhavya", "ria");
         names.stream().filter(name-> name.length()>4).forEach(System.out::println);
         

    }
}
