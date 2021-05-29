package com.zoo.zoomanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Animal
 */
@Entity
@Table(name = "Animal")
public class Animal {

  @Id
  @Column(name = "ANIMAL_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String name;

  @Column
  private AnimalType species;

  public void walk() {
    System.out.println("Animal walks");
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnimalType getSpecies() {
    return this.species;
  }

  public void setSpecies(AnimalType species) {
    this.species = species;
  }
}
