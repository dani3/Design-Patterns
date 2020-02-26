package creational;

import creational.facetedbuilder.PersonBuilder;
import creational.fluentbuilder.EmployeeBuilder;
import solid.opencloseprinciple.*;

import java.util.Arrays;
import java.util.List;

public class Creational {

    /**
     * OPEN-CLOSE PRINCIPLE
     */
    public static void ocp() {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple, tree, house);

        ProductFilter pf = new ProductFilter();
        pf.filter(products, new ColorSpecification(Color.GREEN)).forEach(
                p -> System.out.println(" - " + p.name + " is green")
        );
    }

    /**
     * FLUENT BUILDER INHERITANCE WITH RECURSIVE GENERICS
     */
    public static void fluentBuilder() {
        EmployeeBuilder eb = new EmployeeBuilder();
        creational.fluentbuilder.Person sandra = eb
                .withName("Sandra")
                .worksAt("URJC")
                .build();
    }

    /**
     * FACETED BUILDER
     */
    public static void facetedBuilder() {
        PersonBuilder pb = new PersonBuilder();
        creational.facetedbuilder.Person person = pb
                .lives()
                .at("123 London Road")
                .withPostCode("123456")
                .works()
                .at("URJC")
                .asA("Student")
                .earning(500)
                .build();
    }
}
