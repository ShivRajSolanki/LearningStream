import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class paginationExample {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(i);
        }

        int pageNumber = 2; // page to fetch
        int pageSize = 10;  // records per page

        List<Integer> paginatedList = paginate(list, pageNumber, pageSize);

        System.out.println(paginatedList);
    }

    public static <T> List<T> paginate(List<T> list, int pageNumber, int pageSize) {

        int skip = (pageNumber - 1) * pageSize;

        return list.stream()
                   .skip(skip)
                   .limit(pageSize)
                   .collect(Collectors.toList());
    }
}
    

