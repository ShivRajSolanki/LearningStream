import java.util.Arrays;
import java.util.*;
import java.util.List;

class Emp{
    String name;
    int id;
    double salary;
    Emp(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
     public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }
}
public class sortEmployeeBySalary{
    public static void main(String[] args) {
        List<Emp> employee =Arrays.asList(new Emp("Riya", 5, 50000.00),
              new Emp("Bhavya", 1, 70000.00),
               new Emp("Shivraj", 2, 40000.00),
              new Emp("Nishu", 3, 60000.00),
              new Emp("Raj", 4, 45000.00));
    
    List<Emp> sortedList = employee.stream().sorted(Comparator.comparing(Emp::getSalary).reversed())
                 .toList();
                 System.out.println(sortedList);
}
}