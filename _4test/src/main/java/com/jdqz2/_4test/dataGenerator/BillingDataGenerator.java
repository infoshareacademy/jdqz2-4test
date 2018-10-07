package com.jdqz2._4test.dataGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class BillingDataGenerator extends RandomGenerator {
    public BillingDataGenerator() {
    }
    public ArrayList<String> billingCompanyList = new ArrayList<>(Arrays.asList("Company1","Company2","Company3","Company4","Company5","Company6","Company7"));
    public ArrayList<String> streetAdressList = new ArrayList<>(Arrays.asList("Adress 1","Adress 2","Adress 3","Adress 44","Adress 5","Adress 6","Adress 77"));
    public ArrayList<String> cityList = new ArrayList<>(Arrays.asList("City 1","City 2","City 3","City 44","City 55","City 66","City 77"));
    public ArrayList<String> BillingCountryList = new ArrayList<>(Arrays.asList(
            "CA", "CN", "IN", "RU", "US"
    ));
    public ArrayList<String> postalCodeList = new ArrayList<>(Arrays.asList("80-444","25-654","12-876","13-987","84-485"));
    public ArrayList<String> phoneNumberList = new ArrayList<>(Arrays.asList("735999535","115884908","111444666","886943222","234567089"));

    public BillingFormData generate(){
        BillingFormData bData = new BillingFormData();
        bData.setFirstName(getRandom(firstNameList))
                .setLastName(getRandom(lastNameList))
                .setBillingCompany(getRandom(billingCompanyList))
                .setStreetAdress(getRandom(streetAdressList))
                .setCity(getRandom(cityList))
                .setCountry(getRandom(BillingCountryList))
                .setStateProvince(getRandom(stateProvinceList))
                .setPostalCode(getRandom(postalCodeList))
                .setEmailAddress(bData.getFirstName().toLowerCase() + "." + bData.getLastName().toLowerCase() + random.nextInt(999) + "@example.com")
                .setPhoneNumber(getRandom(phoneNumberList));

        //można zmienić na potrzeby testów
        //data.setCheckPassword(getRandom(firstNameList));
        return bData;
    }
}
