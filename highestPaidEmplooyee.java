import java.util.*;

class Employees{
    String name;
    int id;
    int age;
    double salary;
    public Employees(String name, int id, int age, double salary){
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }
      public int getAge() { return age; }
    public double getSalary() { return salary; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                '}';}

}

public class highestPaidEmplooyee {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(new Employees("Shivraj", 5, 23, 100000.00),
                                                 new Employees("raj", 2, 24, 90000.00),
                                                 new Employees("Riya", 3, 22, 50000.00),
                                                 new Employees("Bhavya", 4, 20, 40000.00),
                                                 new Employees("Nishu", 1, 25, 38000.00)
    );

    Employees highestPaid = employees.stream().max(Comparator.comparing(Employees::getSalary)).orElse(null);
    System.out.println(highestPaid);
    }
}
