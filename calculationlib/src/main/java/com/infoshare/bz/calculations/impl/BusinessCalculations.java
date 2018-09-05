package com.infoshare.bz.calculations.impl;

import com.infoshare.bz.data.Product;
import com.infoshare.bz.calculations.Calculations;

import java.math.BigDecimal;
import java.util.List;

public class BusinessCalculations implements Calculations {

  private BigDecimal businessDiscount = new BigDecimal(0.1);
  private Integer minOrderValue = 1000;

  public BigDecimal calculate(List<Product> productList) {
    BigDecimal orderTotal = productList.stream().map(p -> p.getPrice().multiply(BigDecimal.valueOf(p.getQuantity()))).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    if(orderTotal.doubleValue() < 1000){
      throw new IllegalStateException(String.format("Order total is %s but should be %s", orderTotal,minOrderValue));
    }
    return orderTotal.subtract(orderTotal.multiply(businessDiscount));
  }

}
