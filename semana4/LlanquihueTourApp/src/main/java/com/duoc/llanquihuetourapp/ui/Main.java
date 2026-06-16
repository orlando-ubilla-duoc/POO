package com.duoc.llanquihuetourapp.ui;

import com.duoc.llanquihuetourapp.data.GestorDatos;


public class Main {

	public static void main(String[] args) {

		GestorDatos gestor = new GestorDatos();
		gestor.cargarTxt("../../../../../../../resources/tours.txt");

		// Mostrar listado completo
		System.out.println("Listado completo de tours:");
		System.out.println("==========================");
		gestor.mostrarTours();

		// Mostrar filtrados
		System.out.println("\nListado filtrado: tours con valor mayor a 50 mil pesos");
		System.out.println("==========================");
		gestor.mostrarToursFiltrados(50000);

	}

}