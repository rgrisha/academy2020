package net.swedbank.gyk.collections.productset;

import java.time.LocalDateTime;

public class Product {

  private String id;
  private String name;
  private LocalDateTime lastAppearsOn;

    public Product(String id, String name, LocalDateTime lastAppearsOn) {
        this.id = id;
        this.name = name;
        this.lastAppearsOn = lastAppearsOn;
    }

    public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }



}
