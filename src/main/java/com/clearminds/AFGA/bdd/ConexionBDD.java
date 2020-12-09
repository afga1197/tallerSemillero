package com.clearminds.AFGA.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

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
}
