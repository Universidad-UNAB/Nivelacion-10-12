package com.unab.hotel.IService;

import java.util.List;
import java.util.Optional;

import com.unab.hotel.Collection.Hoteles;


public interface IHotelesService {

	public List<Hoteles> all();
	
	public Optional<Hoteles> findById(String id);
	
	public Hoteles save(Hoteles hoteles);
	
	public void delete(String id);
}
