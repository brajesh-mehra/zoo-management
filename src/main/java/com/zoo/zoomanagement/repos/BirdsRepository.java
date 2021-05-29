package com.zoo.zoomanagement.repos;

import com.zoo.zoomanagement.model.Birds;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdsRepository extends CrudRepository<Birds, Long> {}
