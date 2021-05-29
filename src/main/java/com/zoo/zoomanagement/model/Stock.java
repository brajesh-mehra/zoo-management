package com.zoo.zoomanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Stock")
public class Stock {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Integer stock;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "ANIMAL_ID")
  private Animal animal;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getStock() {
    return this.stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public Animal getAnimal() {
    return this.animal;
  }

  public void setAnimal(Animal animal) {
    this.animal = animal;
  }
}
