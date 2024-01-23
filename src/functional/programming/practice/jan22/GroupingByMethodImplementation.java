package functional.programming.practice.jan22;


import functional.programming.practice.jan19.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByMethodImplementation {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Shweta", "Landge", 25, 450000));
        employees.add(new Employee(102, "Durga", "Rao", 25, 550000));
        employees.add(new Employee(103, "Snehal", "Kalyankar", 24, 400000));
        employees.add(new Employee(104, "Samruddha", "Sawant", 25, 650000));
        employees.add(new Employee(105, "Mounesh", "GS", 24, 600000));
        employees.add(new Employee(106, "Sheyashi", "Kundu", 24, 750000));
        employees.add(new Employee(107, "Rajshekhar", "Patil", 30, 350000));
        employees.add(new Employee(108, "Indranuj", "Ghosh", 31, 850000));

        //group by firstname
        Map<String, List<Employee>> groupingByFirstName = employees.stream().collect(Collectors.groupingBy(Employee::getFirstName));
        System.out.println(groupingByFirstName.keySet());

        //group by lastname
        Map<String, List<Employee>> groupingByLastName = employees.stream().collect(Collectors.groupingBy(Employee::getLastName));
        System.out.println(groupingByLastName.keySet());

        //group by age
        Map<Integer, List<Employee>> groupingByAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(groupingByAge.keySet());

        //group by salary
        Map<Long, List<Employee>> groupingBySalary = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(groupingBySalary.keySet());
    }
}
