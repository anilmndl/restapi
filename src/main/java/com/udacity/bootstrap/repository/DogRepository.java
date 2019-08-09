package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by: ANIL MANDAL on 8/9/2019
 * Description:
 */
public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("SELECT d.id, d.breed FROM Dog d WHERE d.id=:id")
    String findBreedById(Long id);

    @Query("SELECT d.id, d.breed FROM Dog d")
    List<String> findAllBreed();

    @Query("SELECT d.id, d.name FROM Dog d")
    List<String> findAllName();
}
