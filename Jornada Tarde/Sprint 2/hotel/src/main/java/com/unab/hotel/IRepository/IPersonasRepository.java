package com.unab.hotel.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.hotel.Collection.Personas;

public interface IPersonasRepository extends MongoRepository<Personas, String>{

}
