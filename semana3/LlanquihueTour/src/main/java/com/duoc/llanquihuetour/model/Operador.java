package com.duoc.llanquihuetour.model;


public class Operador {

	private String nombre;
	private String idioma;

	public Operador(String nombre, String idioma) {
		this.nombre = nombre;
		this.idioma = idioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}