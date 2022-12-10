package com.unab.hotel.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.hotel.Collection.Pisos;
import com.unab.hotel.IService.IPisosService;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("api/pisos")
public class PisosController {

	@Autowired
	private IPisosService service;
	
	
	@GetMapping
	public List<Pisos> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<Pisos> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pisos save(@RequestBody Pisos pisos) {
		return service.save(pisos);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pisos update(@PathVariable String id, @RequestBody Pisos pisos) {
		Optional<Pisos> op = service.findById(id);

		if (!op.isEmpty()) {
			Pisos pisosUpdate = op.get();
			pisosUpdate.setNombre(pisos.getNombre());						
			pisosUpdate.setEstado(pisos.getEstado());
			pisosUpdate.setSedeId(pisos.getSedeId());
			return service.save(pisosUpdate);
		}

		return pisos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
