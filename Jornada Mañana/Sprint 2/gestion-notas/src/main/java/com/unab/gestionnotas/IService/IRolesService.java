package com.unab.gestionnotas.IService;

import java.util.List;
import java.util.Optional;

import com.unab.gestionnotas.Collection.Roles;

public interface IRolesService {

	public List<Roles> all();
	
	public Optional<Roles> findById(String id);
	
	public Roles save(Roles roles);
	
	public void delete(String id);
}
