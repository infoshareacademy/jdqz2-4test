package com.infoshare.bz.data;

import java.math.BigDecimal;

public class Product {

  private String name;
  private BigDecimal price;
  private Integer quantity;
  private String category;

  public String getName() {
    return name;
  }

  public Product setName(String name) {
    this.name = name;
    return this;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public Product setPrice(BigDecimal price) {
    this.price = price;
    return this;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public Product setQuantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  public String getCategory() {
    return category;
  }

  public Product setCategory(String category) {
    this.category = category;
    return this;
  }

  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            ", category='" + category + '\'' +
            '}';
  }
}
