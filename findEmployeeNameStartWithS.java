import java.util.List;

class Customer {
    private String name;
    private int salary;

    public Customer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}

public class findEmployeeNameStartWithS {
    public static void main(String[] args) {
        List<Customer> employees = List.of(
        new Customer("Shivraj", 50000),
        new Customer("Amit", 40000),
        new Customer("Suresh", 45000),
        new Customer("Rahul", 48000)
);

employees.stream()
        .filter(e -> e.getName().startsWith("S"))
        .forEach(e -> System.out.println(e.getName()));
    }
    
}
