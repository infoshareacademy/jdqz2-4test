package com.infoshare.bz;

import com.infoshare.bz.calculations.Calculate;
import com.infoshare.bz.calculations.CalculationsType;
import com.infoshare.bz.data.Product;

import java.math.BigDecimal;
import java.util.Arrays;

import static com.infoshare.bz.calculations.CountryDiscounts.PL;

public class AppTest {

  public static void main(String[] args) {

    System.out.println(new Calculate(CalculationsType.BUSINESS)
            .setCountry(PL)
            .getOrderTotal(Arrays.asList(
            new Product()
                    .setName("p1")
                    .setCategory("c1")
                    .setPrice(BigDecimal.valueOf(200))
                    .setQuantity(5),
            new Product()
                    .setName("p2")
                    .setCategory("c1")
                    .setPrice(BigDecimal.valueOf(200))
                    .setQuantity(5)
    )));
  }
}
