package com.clearminds.AFGA.bdd.test;

import com.clearminds.AFGA.dtos.Estudiante;
import com.clearminds.AFGA.excepciones.BDDException;
import com.clearminds.AFGA.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try {
			servicioEstudiante.insertarEstudiante(new Estudiante("Juan", "Perez"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
