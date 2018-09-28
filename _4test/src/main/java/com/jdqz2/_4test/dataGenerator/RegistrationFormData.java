package com.jdqz2._4test.dataGenerator;

public class RegistrationFormData {
    protected String firstName;
    protected String lastName;
    protected String country;
    protected String stateProvince;
    protected String emailAddress;
    protected String password;
    // można użyć na potrzeby testów
    //private String checkPassword;


    public String getFirstName() {
        return firstName;
    }

    public RegistrationFormData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public RegistrationFormData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public RegistrationFormData setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public RegistrationFormData setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public RegistrationFormData setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegistrationFormData setPassword(String password) {
        this.password = password;
        return this;
    }
}

