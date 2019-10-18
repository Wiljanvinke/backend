package com.doorloop.zwolle.controller;

import com.doorloop.zwolle.model.Tafel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TafelRepository extends CrudRepository<Tafel, Long> {

}
