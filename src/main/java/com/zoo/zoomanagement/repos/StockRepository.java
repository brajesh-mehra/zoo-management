package com.zoo.zoomanagement.repos;

import com.zoo.zoomanagement.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StockRepository extends CrudRepository<Stock, Long> {
  Stock findByAnimalId(@Param("id") Long id);
}
