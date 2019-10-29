package net.swedbank.gyk.collections.productset;

import java.time.LocalDateTime;

public class Product {

  private String id;
  private String name;
  private LocalDateTime firstSaleOn;

  public Product(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDateTime getFirstSaleOn() {
    return firstSaleOn;
  }

  public void setFirstSaleOn(LocalDateTime firstSaleOn) {
    this.firstSaleOn = firstSaleOn;
  }
}
