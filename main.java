import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
     public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 2, 3);

        Map<Integer, Long> result =
                list.stream()
                    .collect(Collectors.groupingBy(
                            n -> n,
                            Collectors.counting()
                    ));

        result.entrySet().stream()
              .filter(e -> e.getValue() > 1)
              .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
              .forEach(e -> 
                    System.out.println(e.getKey() + "=" + e.getValue())
              );
    }
}
