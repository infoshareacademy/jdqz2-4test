package com.jdqz2._4test.dataGenerator;

public class LoginTestFormData {

    protected String emailAddressLogin = "john.ramos@gmail.com";
    protected String passwordLogin = "John_123";



    public String getEmailAddressLogin() {
        return emailAddressLogin;
    }

    public LoginTestFormData setEmailAddress(String emailAddress) {
        this.emailAddressLogin = emailAddress;
        return this;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public LoginTestFormData setPassword(String password) {
        this.passwordLogin = password;
        return this;
    }


}
