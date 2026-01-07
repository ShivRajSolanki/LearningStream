import java.util.Arrays;
import java.util.List;

public class averageOfAll {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10 , 20 , 30 ,40);
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);
    }
}
