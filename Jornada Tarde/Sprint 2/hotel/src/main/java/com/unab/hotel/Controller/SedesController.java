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

import com.unab.hotel.Collection.Sedes;
import com.unab.hotel.IService.ISedesService;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("api/sedes")
public class SedesController {

	@Autowired
	private ISedesService service;
	
	
	@GetMapping
	public List<Sedes> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<Sedes> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Sedes save(@RequestBody Sedes sedes) {
		return service.save(sedes);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Sedes update(@PathVariable String id, @RequestBody Sedes sedes) {
		Optional<Sedes> op = service.findById(id);

		if (!op.isEmpty()) {
			Sedes sedesUpdate = op.get();
			sedesUpdate.setNombre(sedes.getNombre());						
			sedesUpdate.setEstado(sedes.getEstado());
			sedesUpdate.setHotelId(sedes.getHotelId());
			return service.save(sedesUpdate);
		}

		return sedes;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
