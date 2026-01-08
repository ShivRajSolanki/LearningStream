import java.util.Arrays;
import java.util.List;

public class cubeOfAll {

    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(2,3,4,5);
        List<Integer> cube = list.stream().map(n->n*n*n).toList();
        System.out.println(cube); 
    }
    
}
