import java.util.*;

public class countElementGreaterThanX {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(12,40,45,65,78,89,90);

        long count = n.stream().filter(a->a>50).count();
        System.out.println(count);
    }
}
