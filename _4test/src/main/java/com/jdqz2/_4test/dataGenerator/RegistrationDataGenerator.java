package com.jdqz2._4test.dataGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RegistrationDataGenerator extends RandomGenerator {


    public RegistrationDataGenerator() {
    }

    public RegistrationFormData generate() {
        RegistrationFormData rData = new RegistrationFormData();

        rData.setFirstName(getRandom(firstNameList))
                .setLastName(getRandom(lastNameList))
                .setCountry(getRandom(registrationCountryList))
                .setStateProvince(getRandom(stateProvinceList))
                .setPassword(getRandom(passwordList))
                .setEmailAddress(rData.getFirstName().toLowerCase() + "." + rData.getLastName().toLowerCase() + random.nextInt(999) + "@example.com");

        //można zmienić na potrzeby testów
        //data.setCheckPassword(getRandom(firstNameList));
        return rData;
    }

}
