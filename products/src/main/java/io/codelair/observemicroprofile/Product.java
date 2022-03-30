package io.codelair.observemicroprofile;

import java.util.UUID;

public class Product {
  private String id;
  private String name;

  public Product(UUID randomUUID, String name) {
    id = randomUUID.toString();
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
