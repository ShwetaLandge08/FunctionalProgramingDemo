package functional.programming.practice.jan23;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllFunctionalInterfaces {
    public static void main(String[] args) {
        //predicate interface
        Predicate<Integer> predicate = ((n) -> n % 2 == 0);
        System.out.println(predicate.test(10));

        //Function interface
        Function<String, Integer> function = ((n) -> n.length());
        //first(String) is parameter for abstract method and second(Integer) is return type of method
        System.out.println(function.apply("Shweta"));

        //Consumer interface
        Consumer<Integer> consumer = (i) -> System.out.println(i.byteValue());
        consumer.accept(10);

        //supplier interface
        Supplier<Double> supplier = () -> Math.random();
        Double v = supplier.get();
        System.out.println(v);
    }
}
