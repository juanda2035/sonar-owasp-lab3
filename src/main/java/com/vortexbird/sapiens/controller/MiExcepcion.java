package com.vortexbird.sapiens.controller;

public class MiExcepcion extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3197093054869359518L;
	private final String mensaje;
	
	public MiExcepcion(String mensaje) {
		super(mensaje);
		this.mensaje = mensaje;
	}
	
	public MiExcepcion(String mensaje, Throwable t) {
		super(mensaje, t);
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

}
