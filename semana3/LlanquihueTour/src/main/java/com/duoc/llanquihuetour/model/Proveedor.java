package com.duoc.llanquihuetour.model;


public class Proveedor extends Persona {

	private String tipoProveedor;
	private Rut rutEmpresa;
	private Persona representanteLegal;
	private String giroComercial;

	public Proveedor(String nombre, String email, String telefono, String tipoProveedor, Rut rutEmpresa, Persona representanteLegal, String giroComercial) {
		super(nombre, email, telefono);
		this.tipoProveedor      = tipoProveedor;
		this.rutEmpresa         = rutEmpresa;
		this.representanteLegal = representanteLegal;
		this.giroComercial      = giroComercial;
	}

	public String getTipoProveedor() {
		return tipoProveedor;
	}

	public void setTipoProveedor(String tipoProveedor) {
		this.tipoProveedor = tipoProveedor;
	}

	public Rut getRutEmpresa() {
		return rutEmpresa;
	}

	public void setRutEmpresa(Rut rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public Persona getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(Persona representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public String getGiroComercial() {
		return giroComercial;
	}

	public void setGiroComercial(String giroComercial) {
		this.giroComercial = giroComercial;
	}

	@Override
	public String toString(){
		return "Proveedor{" +
				"nombre=" + getNombre() + '\n' +
				", email=" + getEmail() + '\n' +
				", telefono=" + getTelefono() + '\n' +
				", direccion=" + getDireccion() + '\n' +
				", ciudad=" + getCiudad() + '\n' +
				", rut=" + getRut().getRut() + '\n' +
				", tipoProveedor=" + tipoProveedor + '\n' +
				", rutEmpresa=" + rutEmpresa.getRut() + '\n' +
				", representanteLegal=" + representanteLegal.getNombre() + '\n' +
				", giroComercial=" + giroComercial + '\n' +
			'}';
	}


}