import java.util.*;
import java.util.stream.Collectors;

public class findDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,10,30,40,20);
        Set<Integer>duplicates = list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
