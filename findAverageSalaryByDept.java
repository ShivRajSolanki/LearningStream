import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
}
 public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class findAverageSalaryByDept {
      
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
    new Employee("Riya", "IT", 50000),
    new Employee("Bhavya", "IT", 70000),
    new Employee("Shivraj", "HR", 40000),
    new Employee("Nishu", "HR", 60000),
    new Employee("Raj", "Sales", 45000)
);
Map<String, Double> avgSalaryByDept =
        employees.stream()
                 .collect(Collectors.groupingBy(
                     Employee::getDepartment,
                     Collectors.averagingDouble(Employee::getSalary)
                 ));

System.out.println(avgSalaryByDept);

    }
}
