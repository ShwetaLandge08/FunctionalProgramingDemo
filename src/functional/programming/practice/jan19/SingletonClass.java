package functional.programming.practice.jan19;

public class SingletonClass {
    private int id;
    private String name;
    private static final SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass singletonClass1 = new SingletonClass();
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

    @Override
    public String toString() {
        return "SingletonClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class UseSingletonClass {
    public static void main(String[] args) {
//        SingletonClass singletonClass = new SingletonClass(); should give error


        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.setId(10);
        singletonClass.setName("Shweta");
        System.out.println(singletonClass);
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.setId(12);
        singletonClass1.setName("Ram");
        System.out.println(singletonClass1);
        System.out.println(singletonClass);
    }
}
