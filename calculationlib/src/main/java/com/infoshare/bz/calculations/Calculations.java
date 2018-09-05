package com.infoshare.bz.calculations;

import com.infoshare.bz.data.Product;

import java.math.BigDecimal;
import java.util.List;

public interface Calculations {

  BigDecimal calculate(List<Product> productList);
}
