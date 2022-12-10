package com.unab.hotel.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.hotel.Collection.Hoteles;

public interface IHotelesRepository extends MongoRepository<Hoteles, String>{

}
