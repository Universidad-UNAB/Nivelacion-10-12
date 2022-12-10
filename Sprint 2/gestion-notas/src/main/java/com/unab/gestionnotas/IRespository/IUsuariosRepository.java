package com.unab.gestionnotas.IRespository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.gestionnotas.Collection.Usuarios;

public interface IUsuariosRepository extends MongoRepository<Usuarios, String>{

}
