package com.unab.hotel.IService;

import java.util.List;
import java.util.Optional;

import com.unab.hotel.Collection.Pisos;


public interface IPisosService {

	public List<Pisos> all();
	
	public Optional<Pisos> findById(String id);
	
	public Pisos save(Pisos pisos);
	
	public void delete(String id);
}
