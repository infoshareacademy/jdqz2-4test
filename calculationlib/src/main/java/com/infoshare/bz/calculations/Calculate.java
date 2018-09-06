package com.infoshare.bz.calculations;

import com.infoshare.bz.data.Product;

import java.math.BigDecimal;
import java.util.List;

import static com.infoshare.bz.calculations.CountryDiscounts.DEFAULT;

public class Calculate {

  private Calculations calculations;
  private CountryDiscounts country = DEFAULT;

  public Calculate(CalculationsType type) {
    calculations = new CalculationsFactory().getCalculationsType(type);
  }

  public Calculate setCountry(CountryDiscounts country) {
    this.country = country;
    return this;
  }

  public BigDecimal getOrderTotal(List<Product> productList) {
    return calculations.calculate(productList).multiply(BigDecimal.valueOf(1-country.getDiscount())).setScale(2, 2);
  }

}
