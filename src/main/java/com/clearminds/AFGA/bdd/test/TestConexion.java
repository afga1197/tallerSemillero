package com.clearminds.AFGA.bdd.test;

import java.sql.Connection;

import com.clearminds.AFGA.bdd.ConexionBDD;
import com.clearminds.AFGA.excepciones.BDDException;

public class TestConexion {
	
	public static void main(String[] args) {
		try{
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion!=null){
				System.out.println("Conexion exitosa");
			}
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
