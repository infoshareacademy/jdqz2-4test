package com.infoshare.bz.calculations.impl;

import com.infoshare.bz.data.Product;
import com.infoshare.bz.calculations.Calculations;

import java.math.BigDecimal;
import java.util.List;

public class NormalCalculations implements Calculations {

  @Override
  public BigDecimal calculate(List<Product> productList) {
    return productList.stream().map(p -> p.getPrice().multiply(BigDecimal.valueOf(p.getQuantity()))).reduce(BigDecimal::add).get();
  }

}
