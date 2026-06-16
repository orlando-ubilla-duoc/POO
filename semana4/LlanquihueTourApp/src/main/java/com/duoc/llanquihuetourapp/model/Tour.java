package com.duoc.llanquihuetourapp.model;

public class Tour {

	private String nombreTour;
	private String ubicacion;
	private double precio;

	public Tour(String nombreTour, String ubicacion, double precio) {
		this.nombreTour = nombreTour;
		this.ubicacion = ubicacion;
		this.precio = precio;
	}
	public String getNombreTour() {
		return nombreTour;
	}
	public void setNombreTour(String nombreTour) {
		this.nombreTour = nombreTour;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}