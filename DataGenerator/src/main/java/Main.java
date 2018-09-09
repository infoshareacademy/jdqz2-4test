public class Main {

    public static void main(String[] args) {
		RegistrationDataGenerator registrationDataGenerator = new RegistrationDataGenerator();
		RegistrationFormData generatedData = registrationDataGenerator.generate();
		System.out.println(generatedData.firstName);
		System.out.println(generatedData.lastName);
		System.out.println(generatedData.country);
		System.out.println(generatedData.stateProvince);
		System.out.println(generatedData.emailAddress);
		System.out.println(generatedData.password);
		System.out.println(generatedData.password);
    }
}
