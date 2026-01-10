import java.util.*;

public class skipElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90);
        list.stream().skip(3).forEach(System.out::println);
        list.stream().limit(5).forEach((System.out::println));
    }
    
}
