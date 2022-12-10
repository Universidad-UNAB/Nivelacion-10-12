package com.unab.gestionnotas.IRespository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.gestionnotas.Collection.Roles;

public interface IRolesRepository extends MongoRepository<Roles, String>{

}
