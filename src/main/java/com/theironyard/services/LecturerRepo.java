package com.theironyard.services;

import com.theironyard.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zach on 10/13/16.
 */
public interface LecturerRepo extends CrudRepository<Lecturer, Integer> {

}
