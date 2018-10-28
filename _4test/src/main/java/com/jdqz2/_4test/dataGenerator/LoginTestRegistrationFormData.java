package com.jdqz2._4test.dataGenerator;

public class LoginTestRegistrationFormData {

    protected String firstNameLogin = "John";
    protected String lastNameLogin = "Ramos";
    protected String countryLogin = "AR";
    protected String stateProvinceLogin = "State1";
    protected String emailAddressLogin = "john.ramos@gmail.com";
    protected String passwordLogin = "John_123";

    public String getFirstName() {
        return firstNameLogin;
    }

    public LoginTestRegistrationFormData setFirstName(String firstName) {
        this.firstNameLogin = firstName;
        return this;
    }

    public String getLastName() {
        return lastNameLogin;
    }

    public LoginTestRegistrationFormData setLastName(String lastName) {
        this.lastNameLogin = lastName;
        return this;
    }

    public String getCountry() {
        return countryLogin;
    }

    public LoginTestRegistrationFormData setCountry(String country) {
        this.countryLogin = country;
        return this;
    }

    public String getStateProvince() {
        return stateProvinceLogin;
    }

    public LoginTestRegistrationFormData setStateProvince(String stateProvince) {
        this.stateProvinceLogin = stateProvince;
        return this;
    }

    public String getEmailAddress() {
        return emailAddressLogin;
    }

    public LoginTestRegistrationFormData setEmailAddress(String emailAddress) {
        this.emailAddressLogin = emailAddress;
        return this;
    }

    public String getPassword() {
        return passwordLogin;
    }

    public LoginTestRegistrationFormData setPassword(String password) {
        this.passwordLogin = password;
        return this;
    }


}
