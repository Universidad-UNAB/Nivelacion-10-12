package com.unab.hotel.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.hotel.Collection.Pisos;
import com.unab.hotel.IRepository.IPisosRepository;
import com.unab.hotel.IService.IPisosService;

@Service
public class PisosService implements IPisosService{
	
	@Autowired
	private IPisosRepository repository;

	@Override
	public List<Pisos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Pisos> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Pisos save(Pisos pisos) {
		return repository.save(pisos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);	
	}	
}
