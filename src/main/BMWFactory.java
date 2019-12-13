package main;

public class BMWFactory implements AbstractFactory{
    @Override
    public BMWBike createBike() {
        return new BMWBike();
    }

    @Override
    public Car createCar() {
        return new BMWCar();
    }

    private static class BMWCar extends Car {
        @Override
        public String mark() {
            return "BMW Car";
        }

        @Override
        public int getMaxSpeed() {
            return 200;
        }
    }

    private static class BMWBike extends Bike {
        @Override
        public String getColor() {
            return null;
        }

        @Override
        public String getMark() {
            return null;
        }
    }
}
