package com.unab.hotel.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.hotel.Collection.Sedes;
import com.unab.hotel.IRepository.ISedesRepository;
import com.unab.hotel.IService.ISedesService;

@Service
public class SedesService implements ISedesService{
	
	@Autowired
	private ISedesRepository repository;

	@Override
	public List<Sedes> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Sedes> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Sedes save(Sedes sedes) {
		return repository.save(sedes);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);	
	}	
}
