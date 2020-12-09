package com.clearminds.AFGA.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import com.clearminds.AFGA.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad){
		Properties p = new Properties();
		try {
			p.load(new FileReader("C:/Users/andre/Desktop/CapacitacionCMC/proyectosGit/tallerSemillero/conexion.properties"));
			return p.getProperty(propiedad);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Connection obtenerConexion() throws BDDException{
		String url = leerPropiedad("urlConexion");
		String user = leerPropiedad("user");
		String password = leerPropiedad("password");
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos.");
		}
		return connection;
	}
}
