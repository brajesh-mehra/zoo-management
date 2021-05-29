package com.zoo.zoomanagement.service;

import com.zoo.zoomanagement.model.Birds;
import com.zoo.zoomanagement.model.Stock;
import com.zoo.zoomanagement.repos.BirdsRepository;
import com.zoo.zoomanagement.repos.StockRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BirdsService
 */
@Service
public class BirdsService {

  @Autowired
  private BirdsRepository birdsRepository;

  @Autowired
  private StockRepository stockRepository;

  public List<Birds> getBirds() {
    //TODO: Mapper should e
    return (List) birdsRepository.findAll();
  }

  public Birds create(Birds bird) {
    Birds returnBird = null;
    returnBird = birdsRepository.save(bird);

    Stock stock = null;
    stock = stockRepository.findByAnimalId(returnBird.getId());
    if (stock == null) {
      stock.setAnimal(returnBird);
      stock.setStock(1);
    } else {
      stock.setStock(stock.getStock() + 1);
    }
    stockRepository.save(stock);

    return returnBird;
  }
}
