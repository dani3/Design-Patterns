package creational.facetedbuilder;

public class Person {

    private String streetAddress;
    public String postalCode;

    private String companyName;
    private String position;

    private int annualIncome;

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }
}
