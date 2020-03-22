package org.wirvsvirus.locoronando.dealer;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Dealer {
  @Id
  @GeneratedValue
  private int id;
  private String name;
  @Embedded
  private Address address;

  public int id() {
    return id;
  }

  public String name() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address address() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

}