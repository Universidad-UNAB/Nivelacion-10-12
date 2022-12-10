package com.unab.hotel.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Hoteles")
public class Hoteles {

	@Id
	private String id;
	
	@Field("razonSocial")
	private String razonSocial;
	
	@Field("nit")
	private String nit;
	
	@Field("telefono")
	private String telefono;
	
	@Field("correo")
	private String correo;
	
	@Field("estado")
	private String estado;
	
	@DBRef
	private Personas responsableId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Personas getResponsableId() {
		return responsableId;
	}

	public void setResponsableId(Personas responsableId) {
		this.responsableId = responsableId;
	}	
}
