package solid.opencloseprinciple;

import java.util.Arrays;
import java.util.List;

enum Color {
    RED, GREEN, BLUE
}

enum Size {
    SMALL, MEDIUM, LARGE, HUGE
}

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple, tree, house);

        ProductFilter pf = new ProductFilter();
        pf.filter(products, new ColorSpecification(Color.GREEN)).forEach(
                p -> System.out.println(" - " + p.name + " is green")
        );
    }
}
