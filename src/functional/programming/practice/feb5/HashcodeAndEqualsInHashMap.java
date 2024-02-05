package functional.programming.practice.feb5;

import java.util.HashMap;
import java.util.Map;

public class HashcodeAndEqualsInHashMap {
    public static void main(String[] args) {
        Employee e1=new Employee("Ramesh","Singh",28);
        Employee e2=new Employee("Ramesh1","Singh",28);
        Map<Employee,Integer> hm=new HashMap<Employee,Integer>();
        hm.put(e1,1);
        hm.put(e2,2);
        System.out.println(hm.size());
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        return ((Employee) obj).getLastName() == this.getLastName();
    }

    @Override
    public int hashCode() {
        return getAge();
    }
}

