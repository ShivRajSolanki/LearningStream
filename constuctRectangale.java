import java.util.Arrays;
import java.util.stream.IntStream;

public class constuctRectangale {
    public static void main(String[] args) {
         int area = 122122;   // change input here

        int w = IntStream.iterate((int) Math.sqrt(area), i -> i - 1)
                         .filter(i -> area % i == 0)
                         .findFirst()
                         .getAsInt();

        int l = area / w;

        int[] result = { l, w };

        System.out.println(Arrays.toString(result));
    }
}
