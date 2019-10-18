package com.doorloop.zwolle.controller;

import com.doorloop.zwolle.model.Ober;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface OberRepository extends CrudRepository<Ober, Long> {

}
