package com.duoc.llanquihuetourapp.model;

public class PaseoLacustre extends ServicioTuristico {

	private String tipoEmbarcacion;

	public PaseoLacustre(String nombreTour, String ubicacion, double precio, int duracion, String tipoEmbarcacion) {
		super(nombreTour, duracion, ubicacion, precio);
		this.tipoEmbarcacion = tipoEmbarcacion;
	}
	public String getTipoEmbarcacion() {
		return tipoEmbarcacion;
	}
	public void setTipoEmbarcacion(String tipoEmbarcacion) {
		this.tipoEmbarcacion = tipoEmbarcacion;
	}

	/**
	 * Redefine metodo para imprimir clase.
	 */
	@Override
	public String toString() {
		return "PaseoLacustre {" +
			"nombre=" + getNombre() + '\n' +
			", duracion=" + getDuracionHoras() + '\n' +
			", ciudad=" + getCiudad() + '\n' +
			", precio-servicio=" + getPrecioServicio() + '\n' +
			", tipo-embarcacion=" + getTipoEmbarcacion() + '\n' +
		'}';
	}

}