package com.zoo.zoomanagement.repos;

import com.zoo.zoomanagement.model.Mammals;
import org.springframework.data.repository.CrudRepository;

public interface MammalsRepository extends CrudRepository<Mammals, Long> {}
