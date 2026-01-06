import java.util.*;

public class checkAllPostiveORnot {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,-1,3,4,5,6);
        boolean p = numbers.stream().allMatch(n->n>0);
        System.out.println(p);
    }
}
