package com.duoc.llanquihuetourapp.model;

public class ExcursionCultural extends ServicioTuristico {

	private String lugarHistorico;

	public ExcursionCultural(String nombre, int duracionHoras, String ciudad, double precioServicio, String lugarHistorico) {
		super(nombre, duracionHoras, ciudad, precioServicio);
		this.lugarHistorico = lugarHistorico;
	}

	public String getLugarHistorico() {
		return lugarHistorico;
	}
	public void setLugarHistorico(String lugarHistorico) {
		this.lugarHistorico = lugarHistorico;
	}

	/**
	 * Redefine metodo para imprimir clase.
	 */
	@Override
	public String toString() {
		return "ExcursionCultural {" +
				"nombre excursion=" + getNombre() + '\n' +
				", duracion=" + getDuracionHoras() + '\n' +
				", ciudad=" + getCiudad() + '\n' +
				", precio-servicio=" + getPrecioServicio() + '\n' +
				", lugar-historico=" + getLugarHistorico() + '\n' +
			'}';
	}
}