package com.jdqz2._4test.dataGenerator;

public class Main {

    public static void main(String[] args) {
		RegistrationDataGenerator registrationDataGenerator = new RegistrationDataGenerator();
		RegistrationFormData generatedRegistrationData = registrationDataGenerator.generate();
		System.out.println(generatedRegistrationData.getFirstName());
		System.out.println(generatedRegistrationData.getLastName());
		System.out.println(generatedRegistrationData.getCountry());
		System.out.println(generatedRegistrationData.getStateProvince());
		System.out.println(generatedRegistrationData.getEmailAddress());
		System.out.println(generatedRegistrationData.getPassword());
		System.out.println("---------------------------");
		BillingDataGenerator billingDataGenerator = new BillingDataGenerator();
		BillingFormData generatedBillingData = billingDataGenerator.generate();
		System.out.println(generatedBillingData.getFirstName());
		System.out.println(generatedBillingData.getLastName());
		System.out.println(generatedBillingData.getCountry());
		System.out.println(generatedBillingData.getStateProvince());
		System.out.println(generatedBillingData.getEmailAddress());
		System.out.println(generatedBillingData.getBillingCompany());
		System.out.println(generatedBillingData.getStreetAdress());
		System.out.println(generatedBillingData.getCity());
		System.out.println(generatedBillingData.getPostalCode());
		System.out.println(generatedBillingData.getPhoneNumber());

    }
}
