import java.util.*;
public class secondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,30,20,60,50);

        int secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);
    }
}
