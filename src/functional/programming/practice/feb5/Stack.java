package functional.programming.practice.feb5;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Integer> list = new ArrayList<>();

    public void push(int n) {
        list.add(n);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int size() {
        return list.size();
    }
}

class ImplementStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.list);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.list);
        System.out.println(stack.size());
    }
}
