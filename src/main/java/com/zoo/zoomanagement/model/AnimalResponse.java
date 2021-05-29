package com.zoo.zoomanagement.model;

import java.util.List;

public class AnimalResponse {

  private List<Birds> birds;
  private List<Mammals> mammals;
  private List<Reptiles> reptiles;
  private Long total;

  public List<Birds> getBirds() {
    return this.birds;
  }

  public void setBirds(List<Birds> birds) {
    this.birds = birds;
  }

  public List<Mammals> getMammals() {
    return this.mammals;
  }

  public void setMammals(List<Mammals> mammals) {
    this.mammals = mammals;
  }

  public List<Reptiles> getReptiles() {
    return this.reptiles;
  }

  public void setReptiles(List<Reptiles> reptiles) {
    this.reptiles = reptiles;
  }

  public Long getTotal() {
    return this.total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }
}
