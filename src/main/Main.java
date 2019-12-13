package main;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        AbstractFactory factory = new BMWFactory();
        Bike bike = factory.createBike();
        Car car = factory.createCar();
        System.out.println(car.mark());
    }

    private void runBuider() {
        Pizza pizza = new Pizza.PizzaBuilder()
                .cheese(1)
                .ham(2)
                .olives(5)
                .sausage(2)
                .cheese(2)
                .build();
        System.out.println(pizza);
    }

    private void runSingleton() {
        MySingleton ms1 = MySingleton.getInstance();
        MySingleton ms2 = MySingleton.getInstance();
        System.out.println(ms1==ms2);

        ms1.printHello();

        ms1.setData("vefgbgfnh");
        System.out.println(ms2.getData());
    }
}
