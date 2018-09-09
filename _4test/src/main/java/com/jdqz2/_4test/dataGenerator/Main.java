package com.jdqz2._4test.dataGenerator;

public class Main {

    public static void main(String[] args) {
		RegistrationDataGenerator registrationDataGenerator = new RegistrationDataGenerator();
		RegistrationFormData generatedData = registrationDataGenerator.generate();
		System.out.println(generatedData.getFirstName());
		System.out.println(generatedData.getLastName());
		System.out.println(generatedData.getCountry());
		System.out.println(generatedData.getStateProvince());
		System.out.println(generatedData.getEmailAddress());
		System.out.println(generatedData.getPassword());
		System.out.println(generatedData.getPassword());
    }
}
