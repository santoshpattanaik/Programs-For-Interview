package allprogram.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfEmployeeByNameAgeSalary implements Comparator<Employee> {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Santosh",28,1000000));
        employeeList.add(new Employee("Ashish",29,1100000));
        employeeList.add(new Employee("Ramesh",24,800000));
        System.out.println("Before Sorting: "+employeeList);
        Collections.sort(employeeList,new SortListOfEmployeeByNameAgeSalary());
        System.out.println("After Sorting: "+employeeList);
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        // return o1.getName().compareToIgnoreCase(o2.getName()); Ascending Order By Employee Name
/*        if (o1.getAge() > o2.getAge())
            return 1;
        else if(o1.getAge() < o2.getAge())
            return -1;
        else
            return 0;
            */
        if(o1.getSalary() > o2.getSalary())
            return 1;
        else if (o1.getSalary() < o2.getSalary())
            return -1;
        else
            return 0;

    }
}
class Employee{

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
