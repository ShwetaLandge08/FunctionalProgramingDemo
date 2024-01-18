package functional.programming.practice;

public class ThreadImplementationUsingRunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Welcome to my Thread. implement Runnable Interface");
    }
    public static void main(String[] args)
    {
        ThreadImplementationUsingRunnableInterface threadClass = new ThreadImplementationUsingRunnableInterface(); // creating thread
        threadClass.run(); // starting thread
    }
}
