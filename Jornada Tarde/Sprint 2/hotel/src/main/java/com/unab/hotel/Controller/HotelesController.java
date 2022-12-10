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

import com.unab.hotel.Collection.Hoteles;
import com.unab.hotel.IService.IHotelesService;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("api/hoteles")
public class HotelesController {

	@Autowired
	private IHotelesService service;
	
	
	@GetMapping
	public List<Hoteles> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<Hoteles> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Hoteles save(@RequestBody Hoteles hoteles) {
		return service.save(hoteles);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Hoteles update(@PathVariable String id, @RequestBody Hoteles hoteles) {
		Optional<Hoteles> op = service.findById(id);

		if (!op.isEmpty()) {
			Hoteles hotelesUpdate = op.get();
			hotelesUpdate.setRazonSocial(hoteles.getRazonSocial());
			hotelesUpdate.setNit(hoteles.getNit());
			hotelesUpdate.setTelefono(hoteles.getTelefono());
			hotelesUpdate.setCorreo(hoteles.getCorreo());			
			hotelesUpdate.setEstado(hoteles.getEstado());
			hotelesUpdate.setResponsableId(hoteles.getResponsableId());
			return service.save(hotelesUpdate);
		}

		return hoteles;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
