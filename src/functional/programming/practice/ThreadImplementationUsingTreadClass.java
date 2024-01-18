package functional.programming.practice;

public class ThreadImplementationUsingTreadClass extends Thread{
    public void run()
    {
        System.out.println("Welcome to my Thread. extend Thread class.");
    }
    public static void main(String[] args)
    {
        ThreadImplementationUsingTreadClass threadClass = new ThreadImplementationUsingTreadClass(); // creating thread
        threadClass.start(); // starting thread
    }
}
