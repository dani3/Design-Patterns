package creational.abstractfactory;

public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        return new Tea();
    }
}
