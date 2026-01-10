import java.util.*;

public class max_minString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Shivraj", "Bhavya", "Riya", "Ishan");
        String longest = list.stream().max(Comparator.comparing(String::length)).orElse("") ;
        String shortest = list.stream().min(Comparator.comparing(String::length)).orElse("") ;

        System.out.println(longest);
        System.out.println(shortest);
       }
    

}
