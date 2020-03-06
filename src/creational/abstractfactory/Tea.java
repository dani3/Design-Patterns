package creational.abstractfactory;

public class Tea implements HotDrink {

    @Override
    public void consume() {
        System.out.println("Tea");
    }
}
