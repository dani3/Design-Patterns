package creational.abstractfactory;

public class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        return new Coffee();
    }
}
