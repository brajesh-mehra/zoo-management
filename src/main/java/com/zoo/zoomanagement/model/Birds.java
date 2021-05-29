package com.zoo.zoomanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Birds
 */
@Entity
@Table
public class Birds extends Animal {

  @Column
  private Boolean canFly;

  public Boolean isCanFly() {
    return this.canFly;
  }

  public Boolean getCanFly() {
    return this.canFly;
  }

  public void setCanFly(Boolean canFly) {
    this.canFly = canFly;
  }
}
