package com.duoc.llanquihuetourapp.model;

import java.util.Date;

public class Cliente extends Persona {

	// Fecha en que se enrola al cliente.
	private Date fechaCliente;

	public Cliente(String nombre, String email, String telefono) {
		super(nombre, email, telefono);
	}

	public Date getFechaCliente() {
		return fechaCliente;
	}

	public void setFechaCliente(Date fechaCliente) {
		this.fechaCliente = fechaCliente;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"nombre=" + getNombre() + '\n' +
				", email=" + getEmail() + '\n' +
				", telefono=" + getTelefono() + '\n' +
				", direccion=" + getDireccion() + '\n' +
				", ciudad=" + getCiudad() + '\n' +
				", rut=" + getRut().getRut() + '\n' +
				", fechaCliente=" + fechaCliente + '\n' +
			'}';
	}

}