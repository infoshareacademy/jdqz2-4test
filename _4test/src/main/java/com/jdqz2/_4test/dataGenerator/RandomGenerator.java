package com.jdqz2._4test.dataGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomGenerator {
    public Random random = new Random();
    public ArrayList<String> firstNameList = new ArrayList<>(Arrays.asList("Ania","Kamil","Olek","Imie2","Kasia","Zosia","Imię1"));
    public ArrayList<String> lastNameList = new ArrayList<>(Arrays.asList("Kowal","Nowak","Kowalski","Nazwisko","LastName","Dziuba"));
    public ArrayList<String> registrationCountryList = new ArrayList<>(Arrays.asList(
            "DZ", "AL", "AR", "AU", "AT", "BH", "BY", "BE", "BO", "BA", "BR", "BG", "CA", "CL", "CN", "CO", "CR", "HR",
            "CU", "CY", "CZ", "DK", "DO", "EC", "EG", "SV", "EE", "FI", "FR", "DE", "GR", "GT", "HN", "HK", "HU", "IS",
            "IN", "ID", "IQ", "IE", "IL", "IT", "JP", "JO", "KR", "KW", "LV", "LB", "LY", "LT", "LU", "MK", "MY", "MT",
            "MX", "ME", "MA", "NL", "NZ", "NI", "NO", "OM", "PA", "PY", "PE", "PH", "PL", "PT", "PR", "QA", "RO", "RU",
            "SA", "RS", "SG", "SK", "SI", "ZA", "ES", "SD", "SE", "CH", "SY", "TW", "TH", "TN", "TR", "UA", "AE", "GB",
            "US", "UY", "VE", "VN", "YE"
    ));
    public ArrayList<String> stateProvinceList = new ArrayList<>(Arrays.asList("State1","State2","State3","State4","Province1","Province2"));
    public ArrayList<String> passwordList = new ArrayList<>(Arrays.asList("password1","password2","password3","password4","password5","password6"));
    public String getRandom(ArrayList<String> list) {
        if (list.size() < 1){
            return null;
        }

        if (list.size() == 1) {
            return list.get(0);
        }

        return list.get(random.nextInt(list.size()-1));
    }
}
