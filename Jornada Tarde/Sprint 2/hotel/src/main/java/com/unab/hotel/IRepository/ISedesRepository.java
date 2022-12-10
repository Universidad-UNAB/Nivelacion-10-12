package com.unab.hotel.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.hotel.Collection.Sedes;

public interface ISedesRepository extends MongoRepository<Sedes, String>{

}
