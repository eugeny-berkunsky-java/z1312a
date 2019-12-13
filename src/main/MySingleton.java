package main;

public class MySingleton {
    private static MySingleton instance = new MySingleton();
    private String data;

    private MySingleton(){}

    public static MySingleton getInstance() {
        return instance;
    }

    public void printHello() {
        System.out.println("hello from singleton");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
