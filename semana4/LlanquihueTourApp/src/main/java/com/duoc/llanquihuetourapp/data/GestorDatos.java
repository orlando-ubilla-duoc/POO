package com.duoc.llanquihuetourapp.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.duoc.llanquihuetourapp.excepciones.FormatoArchivoInvalidoException;
import com.duoc.llanquihuetourapp.model.Tour;

public class GestorDatos {

/*
Lea el archivo línea por línea
Separe los datos con .split(";")
Cree objetos con estos datos
Los almacene en un ArrayList
*/
	private List<Tour> tours = new ArrayList<>();

	public GestorDatos() {
		// Constructor vacío
	}

	public void cargarTxt(String fileName){
		try( BufferedReader reader = new BufferedReader(new FileReader(fileName)) ){
			String linea;
			while( (linea = reader.readLine())!=null ){
				try {
					String[] columnas = linea.split(";");
					Tour tour = new Tour( columnas[0], columnas[1], Double.parseDouble(columnas[2]) );
					tours.add(tour);
				} catch (Exception e) {
					throw new FormatoArchivoInvalidoException("El formato del archivo es inválido. Asegúrese de que cada línea tenga el formato: nombreTour;ubicacion;precio");
				}
			}
		} catch (IOException e) {
			//JOptionPane.showMessageDialog( null, "File-read error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		} catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}













	private void grabarArchivo(String registro){

		String nombreArchivo = "prestamos_libros.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))){
			writer.write(registro);
			writer.newLine();
		} catch (IOException e) {
			//JOptionPane.showMessageDialog( null, "Ocurrio un error al guardar en archivo: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	private List<String> leerArchivo(){

		List<String> prestamos = new ArrayList<>();
		String nombreArchivo = "prestamos_libros.txt";

		try( BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo)) ){
			String linea;
			while( (linea = reader.readLine())!=null ){
				prestamos.add(linea);
			}
			if(prestamos.isEmpty()){
				//JOptionPane.showMessageDialog(null, "No se encontraron registros guardados en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (IOException e) {
			//JOptionPane.showMessageDialog( null, "File-read error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		} catch(Exception e){
			//JOptionPane.showMessageDialog( null, "Exception error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}

		return prestamos;
	}


}