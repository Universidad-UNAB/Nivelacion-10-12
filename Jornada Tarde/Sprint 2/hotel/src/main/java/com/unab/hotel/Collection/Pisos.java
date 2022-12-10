package com.unab.hotel.Collection;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Pisos")
public class Pisos {

	@Id
	private String id;
	
	@Field("nombre")
	private String nombre;
	
	@Field("estado")
	private Boolean estado;
	
	@DBRef
	private Sedes sedeId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Sedes getSedeId() {
		return sedeId;
	}

	public void setSedeId(Sedes sedeId) {
		this.sedeId = sedeId;
	}
	
}
