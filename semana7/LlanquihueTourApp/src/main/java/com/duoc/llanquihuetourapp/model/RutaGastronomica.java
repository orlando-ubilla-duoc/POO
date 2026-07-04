package com.duoc.llanquihuetourapp.model;

public class RutaGastronomica extends ServicioTuristico {

	private int numeroDeParadas;

	public RutaGastronomica(String nombre, int duracionHoras, String ciudad, double precioServicio, int numeroDeParadas) {
		super(nombre, duracionHoras, ciudad, precioServicio);
		this.numeroDeParadas = numeroDeParadas;
	}

	public int getNumeroDeParadas() {
		return numeroDeParadas;
	}
	public void setNumeroDeParadas(int numeroDeParadas) {
		this.numeroDeParadas = numeroDeParadas;
	}

	/**
	 * Redefine metodo para imprimir clase.
	 */
	@Override
	public String toString() {
		return "RutaGastronomica {" +
				"nombre=" + getNombre() + '\n' +
				", duracion=" + getDuracionHoras() + '\n' +
				", ciudad=" + getCiudad() + '\n' +
				", precio-servicio=" + getPrecioServicio() + '\n' +
				", numero-de-paradas=" + getNumeroDeParadas() + '\n' +
			'}';
	}

}