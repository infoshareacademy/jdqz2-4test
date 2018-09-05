package com.infoshare.bz.calculations;

public enum CountryDiscounts {
  DEFAULT(0.0),
  PL(0.05),
  DE(0.01),
  DK(0.2),
  UK(0.1);

  private Double discount;

  CountryDiscounts(Double discount){
    this.discount = discount;
  }

  public Double getDiscount() {
    return discount;
  }
}
