package com.clearminds.AFGA.servicios;

import com.clearminds.AFGA.dtos.Estudiante;
import com.clearminds.AFGA.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("insertando estudiante "+estudiante.toString());
		cerrarConexion();
	}
}
