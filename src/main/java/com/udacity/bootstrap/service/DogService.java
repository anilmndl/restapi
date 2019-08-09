package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;

import java.util.List;

/**
 * Created by: ANIL MANDAL on 8/9/2019
 * Description:
 */
public interface DogService {

    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
