package com.clearminds.AFGA.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.AFGA.bdd.ConexionBDD;
import com.clearminds.AFGA.excepciones.BDDException;

public class ServicioBase {

	private Connection conexion;

	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();
	}

	public void cerrarConexion() {
		try {
			if (conexion != null) {
				conexion.close();
				System.out.println("Conexion cerrada");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al cerrar la conexion");
		}
	}

}
