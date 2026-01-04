import java.util.Arrays;
import java.util.List;

class maxValue{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30, 40);
        int max = numbers.stream().max(Integer::compare).orElse(0);

        System.out.println(max);
        
    }
}