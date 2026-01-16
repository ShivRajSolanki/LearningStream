import java.util.*;

class Employe{
    String name;
    int id;
    int age;
    double salary;
    public Employe(String name, int id, int age, double salary){
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



public class findOlderYungerEmployee {
    public static void main(String[] args) {
        List<Employe> employees = Arrays.asList(new Employe("Shivraj", 5, 23, 100000.00),
                                                 new Employe("raj", 2, 24, 90000.00),
                                                 new Employe("Riya", 3, 22, 50000.00),
                                                 new Employe("Bhavya", 4, 20, 40000.00),
                                                 new Employe("Nishu", 1, 25, 38000.00)
    );
     Employe older = employees.stream().max(Comparator.comparing(Employe::getAge)).orElse(null);
     Employe yunger = employees.stream().min(Comparator.comparing(Employe::getAge)).orElse(null);
     System.out.println(older);
     System.out.println(yunger);
    }
}
