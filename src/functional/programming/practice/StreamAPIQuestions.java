package functional.programming.practice;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamAPIQuestions {
    //    Find the second highest paid salary from an Employee using Stream api
//    Write code using streams api to find the student with second highest(or nth)marks from a list of Student
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "shweta", 45000, 25));
        employeeList.add(new Employee(102, "shekhar", 65000, 39));
        employeeList.add(new Employee(103, "raj", 40000, 26));
        employeeList.add(new Employee(104, "rahul", 30000, 23));
        employeeList.add(new Employee(105, "snehal", 55000, 35));
        employeeList.add(new Employee(106, "mounesh", 90000, 40));
        employeeList.add(new Employee(107, "samruddha", 50000, 32));
        employeeList.add(new Employee(108, "shiv", 80000, 28));

        Employee employee = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst().orElse(null);
        assert employee != null;
        System.out.println(employee.getSalary());


//        WAP for following scenario, suppose you have 100 employees, group them on basis of age criteria like 18-30 in one group,
//        30-40 in other and print separate list.
        List<Employee> employeeOnTheBaseOfAge = getEmployeeOnTheBaseOfAge(employeeList, 20, 30);
        System.out.println("Employee List with age between 20 to 30 " + employeeOnTheBaseOfAge);
        System.out.println(employeeOnTheBaseOfAge.size());
        List<Employee> employeeOnTheBaseOfAge1 = getEmployeeOnTheBaseOfAge(employeeList, 30, 40);
        System.out.println("Employee List with age between 30 to 40 " + employeeOnTheBaseOfAge1);
        System.out.println(employeeOnTheBaseOfAge1.size());
    }

    private static List<Employee> getEmployeeOnTheBaseOfAge(List<Employee> employees, int minAge, int maxAge) {
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge && employee.getAge() <= maxAge) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}
