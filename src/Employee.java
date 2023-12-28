import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private int age;
    private int salary;
    Employee(int age,int salary){
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(30,6000);
        Employee e2 = new Employee(31,2000);
        Employee e3 = new Employee(32,3000);
        Employee e4 = new Employee(33,4000);
        Employee e5 = new Employee(34,5000);

        List<Employee> arrayList = new ArrayList<>();
        arrayList.add(e1);arrayList.add(e2);arrayList.add(e3);arrayList.add(e4);
        arrayList.add(e5);
        arrayList.stream().sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);


    }
}
