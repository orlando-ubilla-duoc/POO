package com.duoc.llanquihuetour.app;

import com.duoc.llanquihuetour.excepciones.RutInvalidoException;
import com.duoc.llanquihuetour.model.Cliente;
import com.duoc.llanquihuetour.model.Guia;
import com.duoc.llanquihuetour.model.Persona;
import com.duoc.llanquihuetour.model.Proveedor;
import com.duoc.llanquihuetour.model.Rut;


public class Main {

	public static void main(String[] args) {

		System.out.println("Entidades modelo datos para Empresa Turismo 'Llanquihue Tour'");
		System.out.println("=============================================================");
		System.out.println("");

		try {
			// Instancia clases 1 - Cliente.
			Cliente cliente = new Cliente("Juan Perez", "juan.perez@my-email.com", "987852417");

			System.out.println("Modelo 1: Cliente");
			System.out.println(cliente.toString());
			System.out.println("");

			// Instancia clases 2 - Guía.
			Rut rutGuia = new Rut("10381940-7");
			Guia guia = new Guia("Elena de Troya", "elenatroya@guiatour.com", "987654321", "Griego", rutGuia);

			System.out.println("Modelo 2: Guía");
			System.out.println(guia.toString());
			System.out.println("");

			// Instancia clases 3 - Proveedor.
			Rut rutProveedor           = new Rut("20599760-1");
			Persona representanteLegal = new Persona("Ana Maria Ortiz", "anamaria@proveedor.com", "19068854-2");
			Proveedor proveedor        = new Proveedor("Carlos López", "carlos.lopez@proveedor.com", "912345678", "Transporte", rutProveedor, representanteLegal, "Transportes & Traslados.");

			System.out.println("Modelo 3: Proveedor");
			System.out.println(proveedor.toString());
			System.out.println("");

		} catch (RutInvalidoException e) {
			System.out.println("Error al crear RUT válido: " + e.getMessage());
		}

	}

}