package com.zoo.zoomanagement.service;

import com.zoo.zoomanagement.model.Reptiles;
import com.zoo.zoomanagement.model.Stock;
import com.zoo.zoomanagement.repos.ReptilesRepository;
import com.zoo.zoomanagement.repos.StockRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReptilesService {

  @Autowired
  private ReptilesRepository reptilesRepository;

  @Autowired
  private StockRepository stockRepository;

  public List<Reptiles> getReptiles() {
    //TODO: Mapper should e
    return (List) reptilesRepository.findAll();
  }

  public Reptiles create(Reptiles reptile) {
    Reptiles returnVal = null;
    returnVal = reptilesRepository.save(reptile);

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
