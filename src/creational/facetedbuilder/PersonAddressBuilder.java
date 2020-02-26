package creational.facetedbuilder;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.setStreetAddress(streetAddress);

        return this;
    }

    public PersonAddressBuilder withPostCode(String postCode) {
        person.setPostalCode(postCode);

        return this;
    }
}