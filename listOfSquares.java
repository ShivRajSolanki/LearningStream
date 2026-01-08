import java.util.*;
public class listOfSquares {
    

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5);
        List<Integer> squares = list.stream().map(n->n*n).toList();
        System.out.println(squares);
    }
}

