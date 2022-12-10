package com.unab.hotel.IService;

import java.util.List;
import java.util.Optional;

import com.unab.hotel.Collection.Sedes;


public interface ISedesService {

	public List<Sedes> all();
	
	public Optional<Sedes> findById(String id);
	
	public Sedes save(Sedes sedes);
	
	public void delete(String id);
}
