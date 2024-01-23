package functional.programming.practice.jan19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndSortEmployeeList {
    //Merge two Employee ArrayList and sort by age in using java8 stream API
    public static void main(String[] args) {
        List<Employee>list1 = new ArrayList<>();
        List<Employee>list2=new ArrayList<>();
        list1.add(new Employee(101, "Shweta", "Landge",25,450000));
        list1.add(new Employee(102, "Durga", "Rao",26,550000));
        list1.add(new Employee(103, "Snehal", "Kalyankar",24,400000));
        list1.add(new Employee(104, "Samruddha", "Sawant",27,650000));
        list2.add(new Employee(105, "Mounesh","GS",28, 600000));
        list2.add(new Employee(106, "Sheyashi", "Kundu",29,750000));
        list2.add(new Employee(107, "Rajshekhar", "Patil",30,350000));
        list2.add(new Employee(108, "Indranuj", "Ghosh",31,850000));
        List<Employee> collect = Stream.concat(list1.stream(), list2.stream()).sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
