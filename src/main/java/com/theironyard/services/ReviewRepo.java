package com.theironyard.services;

import com.theironyard.entities.Review;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zach on 10/13/16.
 */
public interface ReviewRepo extends CrudRepository<Review, Integer>{

}
