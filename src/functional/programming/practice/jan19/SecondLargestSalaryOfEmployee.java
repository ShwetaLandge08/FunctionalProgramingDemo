package functional.programming.practice.jan19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondLargestSalaryOfEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Shweta", "Landge",25,450000));
        employeeList.add(new Employee(102, "Durga", "Rao",26,550000));
        employeeList.add(new Employee(103, "Snehal", "Kalyankar",24,400000));
        employeeList.add(new Employee(104, "Samruddha", "Sawant",27,650000));
        employeeList.add(new Employee(105, "Mounesh","GS",28, 600000));
        employeeList.add(new Employee(106, "Sheyashi", "Kundu",29,750000));
        employeeList.add(new Employee(107, "Rajshekhar", "Patil",30,350000));
        employeeList.add(new Employee(108, "Indranuj", "Ghosh",31,850000));

//      Find the second highest paid salary from an Employee using Stream API.
        Optional<Employee> first = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(first);

        List<Employee> employeeBasedOnAge = getEmployeeBasedOnAge(employeeList, 24, 27);
        System.out.println(employeeBasedOnAge);

    }
    //Group list of employees based on age and sort with firstName
    private static List<Employee> getEmployeeBasedOnAge(List<Employee>list,int minAge, int maxAge){
        List<Employee>finalList = new ArrayList<>();
        for(Employee employee:list){
            if(employee.getAge()>=minAge && employee.getAge()<=maxAge){
                finalList.add(employee);
            }
        }
        return finalList.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList());
    }
}
