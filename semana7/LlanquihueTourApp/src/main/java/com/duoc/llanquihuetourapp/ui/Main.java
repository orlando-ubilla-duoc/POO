package com.duoc.llanquihuetourapp.ui;

import com.duoc.llanquihuetourapp.data.GestorServicios;
import com.duoc.llanquihuetourapp.model.ServicioTuristico;


public class Main {

	public static void main(String[] args) {

		GestorServicios gestor = new GestorServicios();

		ServicioTuristico tour1 = gestor.crearExcursionCultural("Tour Cultural", 2, "Santiago", 60000, "Plaza de Armas");
		ServicioTuristico tour2 = gestor.crearExcursionCultural("Tour Histórico", 3, "Valparaíso", 80000, "Cerro Alegre");

		System.out.println("Servicios: Excursion Cultural");
		System.out.println("==========================");
		tour1.toString();
		tour2.toString();

		ServicioTuristico tour3 = gestor.crearPaseoLacustre("Paseo en Barco", "Puerto Varas", 50000, 2, "Lancha");
		ServicioTuristico tour4 = gestor.crearPaseoLacustre("Paseo en Catamarán", "Puerto Montt", 70000, 3, "Catamarán");

		System.out.println("Servicios: Paseo Lacustre");
		System.out.println("==========================");
		tour3.toString();
		tour4.toString();

		ServicioTuristico tour5 = gestor.crearRutaGastronomica("Ruta Gastronómica", 4, "Puerto Varas", 90000, 2);
		ServicioTuristico tour6 = gestor.crearRutaGastronomica("Ruta de Sabores", 5, "Puerto Montt", 110000, 3);

		System.out.println("Servicios: Ruta Gastronómica");
		System.out.println("==========================");
		tour5.toString();
		tour6.toString();

	}

}