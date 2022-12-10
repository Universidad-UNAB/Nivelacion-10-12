package com.unab.hotel.Collection;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Sedes")
public class Sedes {

	@Id
	private String id;
	
	@Field("nombre")
	private String nombre;
	
	@Field("estado")
	private Boolean estado;
	
	@DBRef
	private Hoteles hotelId;

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

	public Hoteles getHotelId() {
		return hotelId;
	}

	public void setHotelId(Hoteles hotelId) {
		this.hotelId = hotelId;
	}
	
}
