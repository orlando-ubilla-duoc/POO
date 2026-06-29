package com.duoc.llanquihuetourapp.data;

import com.duoc.llanquihuetourapp.model.ExcursionCultural;
import com.duoc.llanquihuetourapp.model.PaseoLacustre;
import com.duoc.llanquihuetourapp.model.RutaGastronomica;

public class GestorServicios {

	public GestorServicios() {
		// Constructor
	}

	public PaseoLacustre crearPaseoLacustre(String nombre,
                                          String ciudad,
                                          double precioServicio,
                                          int duracionHoras,
                                          String tipoBarco ){
		return new PaseoLacustre(nombre, ciudad, precioServicio, duracionHoras, tipoBarco);
	}

	public ExcursionCultural crearExcursionCultural(String nombre,
                          int duracionHoras,
                          String ciudad,
                          double precioServicio,
                          String lugarHistorico ){
		return new ExcursionCultural(nombre, duracionHoras, ciudad, precioServicio, lugarHistorico);
	}

	public RutaGastronomica crearRutaGastronomica(String nombre,
						  int duracionHoras,
						  String ciudad,
						  double precioServicio,
						  int numeroDeParadas ){
		return new RutaGastronomica(nombre, duracionHoras, ciudad, precioServicio, numeroDeParadas);
	}

}