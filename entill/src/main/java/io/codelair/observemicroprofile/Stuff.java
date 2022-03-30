package io.codelair.observemicroprofile;

import java.util.UUID;

public class Stuff {
  private String description;
  private String id = UUID.randomUUID().toString();
  private String purpose;

  public Stuff(String description, String purpose) {
    this.description = description;
    this.purpose = purpose;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }
}
