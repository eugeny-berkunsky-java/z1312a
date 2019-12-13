package main;

public class Pizza {
    private int cheese;
    private int olives;
    private int ham;
    private int tomatoes;
    private int sausage;
    private int meat;

    private Pizza() {}

    public static class PizzaBuilder {
        Pizza pizza = new Pizza();

        public PizzaBuilder meat(int qty) {
            pizza.meat+=qty;
            return this;
        }

        public PizzaBuilder olives(int qty) {
            pizza.olives+=qty;
            return this;
        }

        public PizzaBuilder ham(int qty) {
            pizza.ham+=qty;
            return this;
        }

        public PizzaBuilder tomatoes(int qty) {
            pizza.tomatoes+=qty;
            return this;
        }

        public PizzaBuilder cheese(int qty) {
            pizza.cheese+=qty;
            return this;
        }

        public PizzaBuilder sausage(int qty) {
            pizza.sausage+=qty;
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese=" + cheese +
                ", olives=" + olives +
                ", ham=" + ham +
                ", tomatoes=" + tomatoes +
                ", sausage=" + sausage +
                ", meat=" + meat +
                '}';
    }
}
