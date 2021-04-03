package allprogram.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeDetails{
    String name;
    int salary;

    public EmployeeDetails(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class ComparatorDemo implements Comparator<EmployeeDetails> {
    public static void main(String[] args) {
        EmployeeDetails obj1=new EmployeeDetails("SANTOSH",100000);
        EmployeeDetails obj2=new EmployeeDetails("ASHISH",20000);
        EmployeeDetails obj3=new EmployeeDetails("SANJAYA",300000);

        List<EmployeeDetails> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Collections.sort(list,new ComparatorDemo());
        System.out.println(list);
        for (EmployeeDetails obj:list){
            System.out.println("Name: "+obj.name+" Salary: "+obj.salary);
        }
    }
    @Override
    public int compare(EmployeeDetails o1, EmployeeDetails o2) {
        if (o1.salary > o2.salary)
            return -1;
        else if(o1.salary < o1.salary)
            return 1;
        else
            return 0;
/*
        if(o1.salary > o2.salary)
            return -1;
        else if (o1.salary < o2.salary)
            return 1;
        else
            return 0;*/
    }
}
