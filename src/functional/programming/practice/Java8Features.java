package functional.programming.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Features {
    public static void main(String[] args) {
        //sorted, skip, limit, allMatch, noneMatch, anyMatch methods
        List<Courses> listOfCourses = List.of(new Courses("Spring", "Framework", 400000, 3000),
                new Courses("Spring Boot", "Framework", 500000, 8000),
                new Courses("Azure", "Cloud", 300000, 5000),
                new Courses("Docker", "Cloud", 600000, 2000),
                new Courses("AWS", "Cloud", 700000, 4000),
                new Courses("Kubernetes", "Cloud", 200000, 7000),
                new Courses("Microservices", "Architecture Design", 900000, 10000));

        //sorted
        List<Courses> collect1 = listOfCourses.stream().sorted(Comparator.comparing(Courses::getName)).collect(Collectors.toList());
        List<Courses> collect2 = listOfCourses.stream().sorted(Comparator.comparing(Courses::getName).reversed()).collect(Collectors.toList());

        List<Courses> collect3 = listOfCourses.stream().sorted(Comparator.comparing(Courses::getPriceOfCourse)).collect(Collectors.toList());
        List<Courses> collect4 = listOfCourses.stream().sorted(Comparator.comparing(Courses::getStudentRegisteredForCourse)).collect(Collectors.toList());
        List<Courses> collect5 = listOfCourses.stream().sorted(Comparator.comparing(Courses::getTypeOfCourse)).collect(Collectors.toList());
        System.out.println("Sorted by name : " + collect1);
        System.out.println("Sorted by name descending : " + collect2);
        System.out.println("Sorted by price of course : " + collect3);
        System.out.println("Sorted by student number : " + collect4);
        System.out.println("Sorted by type of course : " + collect5);

        //skip
        //get second-highest expensive course from list
        Optional<Courses> first = listOfCourses.stream().sorted(Comparator.comparing(Courses::getPriceOfCourse).reversed()).skip(1).findFirst();
        System.out.println(first);

        //get 3rd lowest student course
        Optional<Courses> first1 = listOfCourses.stream().sorted(Comparator.comparing(Courses::getStudentRegisteredForCourse)).skip(2).findFirst();
        System.out.println(first1);

        //limit
        List<Courses> collect6 = listOfCourses.stream().filter(n -> n.getPriceOfCourse() > 4000).limit(3).collect(Collectors.toList());
        System.out.println(collect6);

        //allMatch
        boolean s = listOfCourses.stream().allMatch(c -> c.getPriceOfCourse() >= 200000);
        System.out.println(s);

        //anyMatch
        boolean s1 = listOfCourses.stream().map(c -> c.getName().toLowerCase()).anyMatch(chara -> chara.startsWith("s"));
        System.out.println(s1);

        //noneMatch
        boolean b = listOfCourses.stream().noneMatch(st -> st.getStudentRegisteredForCourse() >= 11000);
        System.out.println(b);

        //map
        int[] arr = {1, 4, 6, 2, 5, -9, 7, -4};
    }
}

class Courses {
    private String name;
    private String typeOfCourse;
    private double priceOfCourse;
    private long studentRegisteredForCourse;

    public Courses(String name, String typeOfCourse, double priceOfCourse, long studentRegisteredForCourse) {
        this.name = name;
        this.typeOfCourse = typeOfCourse;
        this.priceOfCourse = priceOfCourse;
        this.studentRegisteredForCourse = studentRegisteredForCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfCourse() {
        return typeOfCourse;
    }

    public void setTypeOfCourse(String typeOfCourse) {
        this.typeOfCourse = typeOfCourse;
    }

    public double getPriceOfCourse() {
        return priceOfCourse;
    }

    public void setPriceOfCourse(double priceOfCourse) {
        this.priceOfCourse = priceOfCourse;
    }

    public long getStudentRegisteredForCourse() {
        return studentRegisteredForCourse;
    }

    public void setStudentRegisteredForCourse(long studentRegisteredForCourse) {
        this.studentRegisteredForCourse = studentRegisteredForCourse;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                ", typeOfCourse='" + typeOfCourse + '\'' +
                ", priceOfCourse=" + priceOfCourse +
                ", studentRegisteredForCourse=" + studentRegisteredForCourse +
                '}';
    }
}
