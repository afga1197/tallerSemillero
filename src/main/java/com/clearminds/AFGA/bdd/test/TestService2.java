package com.clearminds.AFGA.bdd.test;

import com.clearminds.AFGA.dtos.Estudiante;
import com.clearminds.AFGA.excepciones.BDDException;
import com.clearminds.AFGA.servicios.ServicioEstudiante;

public class TestService2 {

	public static void main(String[] args) {
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try {
			servicioEstudiante.actualizarEstudiante(new Estudiante("Juanes", "Perez", 3));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}