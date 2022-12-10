package com.unab.hotel.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.hotel.Collection.Hoteles;
import com.unab.hotel.IRepository.IHotelesRepository;
import com.unab.hotel.IService.IHotelesService;

@Service
public class HotelesService implements IHotelesService{
	
	@Autowired
	private IHotelesRepository repository;

	@Override
	public List<Hoteles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Hoteles> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Hoteles save(Hoteles hoteles) {
		return repository.save(hoteles);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);	
	}	
}
