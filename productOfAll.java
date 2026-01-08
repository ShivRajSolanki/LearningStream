import java.util.*;
public class productOfAll {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5);
        int product = list.stream().reduce(1,(a,b)->a*b);
        System.out.println(product);
    }
}
