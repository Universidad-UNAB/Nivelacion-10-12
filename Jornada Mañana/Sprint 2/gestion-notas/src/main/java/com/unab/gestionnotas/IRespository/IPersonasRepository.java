package com.unab.gestionnotas.IRespository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.gestionnotas.Collection.Personas;

public interface IPersonasRepository extends MongoRepository<Personas, String>{

}
