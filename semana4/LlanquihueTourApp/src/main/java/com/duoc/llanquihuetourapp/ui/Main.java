package com.duoc.llanquihuetourapp.ui;

import com.duoc.llanquihuetourapp.data.GestorDatos;


public class Main {

	public static void main(String[] args) {

		GestorDatos gestor = new GestorDatos();
		gestor.cargarTxt("tours.txt");

		// Mostrar listado completo
		gestor.mostrarTours();

		// Mostrar filtrados

	}

}