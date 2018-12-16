package com.jdqz2._4test;
import com.jdqz2._4test.dataGenerator.RandomGenerator;
import com.jdqz2._4test.dataGenerator.RegistrationDataGenerator;
import com.jdqz2._4test.dataGenerator.RegistrationFormData;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneratorTest {

@Test
public void getRandomTest(){

    RandomGenerator randomGenerator = new RandomGenerator();
    ArrayList<String> testArrayList = new ArrayList<>(Arrays.asList("TestValue1"));
    randomGenerator.getRandom(testArrayList);

    String testValue=randomGenerator.getRandom(testArrayList);

    Assert.assertNotNull(testValue);
    Assert.assertEquals(testValue,testArrayList.get(0));

        }

@Test
public void generateDoNotReturnNull(){
        RegistrationDataGenerator dataGenerator = new RegistrationDataGenerator();
        dataGenerator.generate();
        Assert.assertNotNull(dataGenerator.generate());
        }

@Test
public void getCountryIsNotNull(){
        RegistrationDataGenerator countryGenerator = new RegistrationDataGenerator();
        RegistrationFormData generateCountry = countryGenerator.generate();
        Assert.assertNotNull(generateCountry.getCountry());

        }

}




