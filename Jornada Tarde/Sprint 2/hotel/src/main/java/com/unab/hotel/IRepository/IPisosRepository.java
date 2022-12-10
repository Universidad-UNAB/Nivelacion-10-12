package com.unab.hotel.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.hotel.Collection.Pisos;

public interface IPisosRepository extends MongoRepository<Pisos, String>{

}
