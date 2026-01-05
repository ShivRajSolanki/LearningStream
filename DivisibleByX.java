import java.util.*;

public class DivisibleByX{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,14,18,30,42);

        boolean exists = numbers.stream().anyMatch(n->n%5==0);
        System.out.println(exists);
    }
}