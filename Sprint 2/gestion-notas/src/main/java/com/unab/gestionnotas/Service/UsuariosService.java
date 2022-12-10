package com.unab.gestionnotas.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.gestionnotas.Collection.Usuarios;
import com.unab.gestionnotas.IRespository.IUsuariosRepository;
import com.unab.gestionnotas.IService.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService{
	
	@Autowired
	private IUsuariosRepository repository;

	@Override
	public List<Usuarios> all() {		
		return repository.findAll();
	}

	@Override
	public Optional<Usuarios> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Usuarios save(Usuarios usuarios) {
		return repository.save(usuarios);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}	
}
