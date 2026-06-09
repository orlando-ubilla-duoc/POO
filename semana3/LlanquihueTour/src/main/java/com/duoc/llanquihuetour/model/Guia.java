package com.duoc.llanquihuetour.model;

/**
 * Clase que representa a un guía turístico.
 */
public class Guia extends Persona {

	private String idioma;
	private Rut rutComercial;

	/**
	 * Constructor que recibe los datos personales del guía, su idioma y su RUT comercial.
	 * @param nombre El nombre completo del guia.
	 * @param email El correo electrónico del guia.
	 * @param telefono El número de teléfono del guia.
	 * @param idioma El idioma que habla el guia.
	 * @param rutComercial El RUT comercial del guia turistico.
	 */
	public Guia(String nombre, String email, String telefono, String idioma, Rut rutComercial) {
		super(nombre, email, telefono);
		this.idioma       = idioma;
		this.rutComercial = rutComercial;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Rut getRutComercial() {
		return rutComercial;
	}

	public void setRutComercial(Rut rutComercial) {
		this.rutComercial = rutComercial;
	}

	@Override
	public String toString() {
		return "Guia{" +
				"nombre=" + getNombre() + '\n' +
				", email=" + getEmail() + '\n' +
				", telefono=" + getTelefono() + '\n' +
				", direccion=" + getDireccion() + '\n' +
				", ciudad=" + getCiudad() + '\n' +
				", rut=" + getRut().getRut() + '\n' +
				", idioma='" + idioma + '\n' +
				", rutComercial=" + rutComercial.getRut() + '\n' +
			'}';
	}

}