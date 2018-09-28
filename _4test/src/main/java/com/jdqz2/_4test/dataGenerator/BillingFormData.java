package com.jdqz2._4test.dataGenerator;

public class BillingFormData extends RegistrationFormData {
    protected String billingCompany;
    protected String streetAdress;
    protected String city;
    protected String postalCode;
    protected String phoneNumber;

    @Override
    public BillingFormData setFirstName(String firstName) {
        return (BillingFormData)super.setFirstName(firstName);
    }

    @Override
    public BillingFormData setLastName(String lastName) {
        return (BillingFormData)super.setLastName(lastName);
    }

    @Override
    public BillingFormData setCountry(String country) {
        return (BillingFormData)super.setCountry(country);
    }

    @Override
    public BillingFormData setStateProvince(String stateProvince) {
        return (BillingFormData)super.setStateProvince(stateProvince);
    }

    @Override
    public BillingFormData setEmailAddress(String emailAddress) {
        return (BillingFormData)super.setEmailAddress(emailAddress);
    }

    @Override
    public BillingFormData setPassword(String password) {
        return (BillingFormData)super.setPassword(password);
    }

    public String getBillingCompany() {
        return billingCompany;
    }

    public BillingFormData setBillingCompany(String billingCompany) {
        this.billingCompany = billingCompany;
        return this;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public BillingFormData setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
        return this;
    }

    public String getCity() {
        return city;
    }

    public BillingFormData setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public BillingFormData setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public BillingFormData setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
