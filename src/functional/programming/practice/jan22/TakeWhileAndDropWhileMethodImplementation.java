package functional.programming.practice.jan22;

import functional.programming.practice.jan19.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileAndDropWhileMethodImplementation {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(101, "Shweta", "Landge", 25, 450000));
        list1.add(new Employee(102, "Durga", "Rao", 26, 550000));
        list1.add(new Employee(103, "Snehal", "Kalyankar", 24, 400000));
        list1.add(new Employee(104, "Samruddha", "Sawant", 27, 650000));
        list1.add(new Employee(105, "Mounesh", "GS", 28, 600000));
        list1.add(new Employee(106, "Sheyashi", "Kundu", 29, 750000));
        list1.add(new Employee(107, "Rajshekhar", "Patil", 30, 350000));
        list1.add(new Employee(108, "Indranuj", "Ghosh", 31, 850000));

        //takeWhile
        List<Employee> takeWhile = list1.stream().takeWhile(s -> s.getFirstName().startsWith("S")).collect(Collectors.toList());
        System.out.println(takeWhile);

        //dropWhile
        List<Employee> dropWhile = list1.stream().dropWhile(s -> s.getFirstName().startsWith("S")).collect(Collectors.toList());
        System.out.println(dropWhile);
    }
}
