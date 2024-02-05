package functional.programming.practice.feb5;

import functional.programming.practice.jan19.MinimumAndMaximumValueInList;

public class Animal {
    public void eat() {
        System.out.println("Animal eat");
    }

    public void sleep() {
        System.out.println("Animal Sleep");
    }

}

class Bird extends Animal {
    public void fly() {
        System.out.println("Bird fly");
    }
    @Override
    public void eat() {
        System.out.println("Bird eat");
    }

    @Override
    public void sleep() {
        System.out.println("Bird Sleep");
    }

    public static void main(String[] args) {
       // Animal a1 = new Bird();
        //a1.fly(); // fly method is not available in Animal

       // Bird a2 = new Animal();//compiler error
//        a2.eat();

        Bird a3 = (Bird) new Animal();//ClassCastException
        a3.fly();

        Bird a4 = new Bird();
        a4.eat();
        Animal a1 = new Animal();
        a1.eat();
        Animal b1 = new Bird();
        b1.eat();
    }
}
