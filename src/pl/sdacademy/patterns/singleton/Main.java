package pl.sdacademy.patterns.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton == singleton1);

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum == singletonEnum2);
    }
}
