import java.util.*;

public class sortElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,3,7,4,9,1);
       List<Integer>ascending = list.stream().sorted().toList();
        List<Integer>decascending = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(ascending);
        System.out.println(decascending);

    }
}
