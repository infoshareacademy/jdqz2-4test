package com.jdqz2._4test.dataGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RegistrationDataGenerator {
    private Random random = new Random();
    private ArrayList<String> firstNameList = new ArrayList<>(Arrays.asList("Ania","Kamil","Olek","Imie2","Kasia","Zosia","Imię1"));
    private ArrayList<String> lastNameList = new ArrayList<>(Arrays.asList("Kowal","Nowak","Kowalski","Nazwisko","LastName","Dziuba"));
    private ArrayList<String> countryList = new ArrayList<>(Arrays.asList(
            "DZ", "AL", "AR", "AU", "AT", "BH", "BY", "BE", "BO", "BA", "BR", "BG", "CA", "CL", "CN", "CO", "CR", "HR",
            "CU", "CY", "CZ", "DK", "DO", "EC", "EG", "SV", "EE", "FI", "FR", "DE", "GR", "GT", "HN", "HK", "HU", "IS",
            "IN", "ID", "IQ", "IE", "IL", "IT", "JP", "JO", "KR", "KW", "LV", "LB", "LY", "LT", "LU", "MK", "MY", "MT",
            "MX", "ME", "MA", "NL", "NZ", "NI", "NO", "OM", "PA", "PY", "PE", "PH", "PL", "PT", "PR", "QA", "RO", "RU",
            "SA", "RS", "SG", "SK", "SI", "ZA", "ES", "SD", "SE", "CH", "SY", "TW", "TH", "TN", "TR", "UA", "AE", "GB",
            "US", "UY", "VE", "VN", "YE"
    ));
    private ArrayList<String> stateProvinceList = new ArrayList<>(Arrays.asList("State1","State2","State3","State4","Province1","Province2"));
    private ArrayList<String> passwordList = new ArrayList<>(Arrays.asList("password1","password2","password3","password4","password5","password6"));
    private String getRandom(ArrayList<String> list){
        return list.get(random.nextInt(list.size()-1));
    }

    public RegistrationDataGenerator() {
    }

    public RegistrationFormData generate(){
        RegistrationFormData data = new RegistrationFormData();
        /*alternatywna metoda zakladajaca public pola w klasie RegistrationFormData bez geterow i seterow
        data.firstName = getRandom(firstNameList);
        data.lastName = getRandom(lastNameList);
        data.country = getRandom(countryList);
        data.stateProvince = getRandom(stateProvinceList);
        data.emailAddress = data.firstName.toLowerCase() + "." + data.lastName.toLowerCase() + random.nextInt(999) + "@example.com";
        data.password = getRandom(passwordList);*/
        data.setFirstName(getRandom(firstNameList))
                .setLastName(getRandom(lastNameList))
                .setCountry(getRandom(countryList))
                .setStateProvince(getRandom(stateProvinceList))
                .setPassword(getRandom(passwordList))
                .setEmailAddress(data.getFirstName().toLowerCase() + "." + data.getLastName().toLowerCase() + random.nextInt(999) + "@example.com");

        //można zmienić na potrzeby testów
        //data.setCheckPassword(getRandom(firstNameList));
        return data;
    }

}
