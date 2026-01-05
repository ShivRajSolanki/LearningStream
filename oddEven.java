import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,11,13,15);

        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
         System.out.println("Odd numbers-----------------------");

         numbers.stream().filter(n->n%2 !=0).forEach(System.out::println);
    }
}
