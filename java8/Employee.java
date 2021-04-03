package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Employee Name: " + name + " age: " + age;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = createEmployeeList();

        //Get All the employees age > 30 o/p - c d e
        List<String> employeesAgeGt30 = employeeList.stream().filter(empObj -> empObj.getAge() > 30)
                .map(Employee::getName).
                        collect(Collectors.toList());
        employeesAgeGt30.forEach(System.out::println);

        long employeeCountAgeGt25 = (employeeList.stream()
                .filter(employee -> employee.getAge() > 25)
                .count());
        System.out.println(employeeCountAgeGt25);


        Optional<Employee> findNameMary = employeeList.stream().filter(employee -> employee.getName().equals("Mary")).findFirst();
        findNameMary.ifPresent(System.out::println);

        OptionalInt maximumAgeOfEmployee = employeeList.stream().mapToInt(employee -> employee.getAge()).max();
        System.out.println(maximumAgeOfEmployee.getAsInt());

        Employee employee = employeeList.stream().min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(employee);

        Employee employee1 = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(employee1);

        List<String> employeeNames = employeeList.stream().map(employee2 -> employee2.getName()).collect(Collectors.toList());
        System.out.println(employeeNames);

        String employeeNamesWithComma = String.join("||", employeeNames);
        System.out.println(employeeNamesWithComma);

        Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        map.forEach((name, employeeNameList) -> System.out.println(name + " : " + employeeNameList));

        List<Integer> integerList = new ArrayList<>(Arrays.asList(100, 24, 13, 44, 114, 200, 40, 112));
        OptionalDouble average = integerList.stream().mapToInt(no -> no * no).filter(filterNo -> filterNo > 10000).average();
        System.out.println(average.getAsDouble());

        List<Integer> integerListDuplicate = new ArrayList<>(Arrays.asList(24, 24, 13, 44, 114, 200, 40, 112));
        System.out.println("Distinct: "+integerListDuplicate.stream().distinct().collect(Collectors.toList()));

        List<Integer> list
                = Arrays.asList(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34);
        System.out.println(list.stream().filter(integer -> Collections.frequency(list,integer) > 1).collect(Collectors.toSet()));

    }

    public static List<Employee> createEmployeeList() {
        Employee e1 = new Employee("ya", 20);
        Employee e2 = new Employee("b", 30);
        Employee e3 = new Employee("c", 40);
        Employee e4 = new Employee("d", 50);
        Employee e5 = new Employee("Mary", 60);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        return employeeList;

    }
}
