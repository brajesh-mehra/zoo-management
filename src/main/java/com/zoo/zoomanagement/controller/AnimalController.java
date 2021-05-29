package com.zoo.zoomanagement.controller;

import com.zoo.zoomanagement.model.Animal;
import com.zoo.zoomanagement.model.AnimalResponse;
import com.zoo.zoomanagement.model.Birds;
import com.zoo.zoomanagement.model.Mammals;
import com.zoo.zoomanagement.model.Reptiles;
import com.zoo.zoomanagement.repos.StockRepository;
import com.zoo.zoomanagement.service.BirdsService;
import com.zoo.zoomanagement.service.MammalsService;
import com.zoo.zoomanagement.service.ReptilesService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AnimalController
 */
@RestController
@RequestMapping("/api/")
public class AnimalController {

  @Autowired
  private BirdsService birdsService;

  @Autowired
  private MammalsService mammalsService;

  @Autowired
  private ReptilesService reptilesService;

  @Autowired
  private StockRepository stockRepository;

  @GetMapping("animals")
  public AnimalResponse getAnimal() {
    AnimalResponse animals = new AnimalResponse();

    var birds = birdsService.getBirds();

    var mammals = mammalsService.getMammals();

    var reptiles = reptilesService.getReptiles();

    Long total = stockRepository.count();

    animals.setBirds(birds);
    animals.setMammals(mammals);
    animals.setReptiles(reptiles);
    animals.setTotal(total);

    return animals;
  }

  @PostMapping("animals/birds")
  public Birds saveBirds(@RequestBody Birds request) {
    return birdsService.create(request);
  }

  @PostMapping("animals/mammal")
  public Mammals saveMammals(@RequestBody Mammals request) {
    return mammalsService.create(request);
  }

  @PostMapping("animals/reptile")
  public Reptiles saveReptiles(@RequestBody Reptiles request) {
    return reptilesService.create(request);
  }
}
