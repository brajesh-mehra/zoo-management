package com.zoo.zoomanagement.service;

import com.zoo.zoomanagement.model.Mammals;
import com.zoo.zoomanagement.model.Stock;
import com.zoo.zoomanagement.repos.MammalsRepository;
import com.zoo.zoomanagement.repos.StockRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MammalsService {

  @Autowired
  private MammalsRepository mammalsRepository;

  @Autowired
  private StockRepository stockRepository;

  public List<Mammals> getMammals() {
    //TODO: Mapper should e
    return (List) mammalsRepository.findAll();
  }

  public Mammals create(Mammals mammal) {
    Mammals returnVal = null;
    returnVal = mammalsRepository.save(mammal);

    Stock stock = null;
    stock = stockRepository.findByAnimalId(returnVal.getId());
    if (stock == null) {
      stock.setAnimal(returnVal);
      stock.setStock(1);
    } else {
      stock.setStock(stock.getStock() + 1);
    }
    stockRepository.save(stock);

    return returnVal;
  }
}
