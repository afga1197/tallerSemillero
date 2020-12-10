package com.clearminds.AFGA.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.clearminds.AFGA.bdd.DateUtil;
import com.clearminds.AFGA.dtos.Estudiante;
import com.clearminds.AFGA.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("insertando estudiante " + estudiante.toString());
		Statement stmt = null;
		String sql = "";
		if(estudiante.getEdad()==null){	
			sql = "INSERT INTO estudiantes (nombre, apellido, fecha_modificacion) VALUES('"+estudiante.getNombre()+"', '"
					+ estudiante.getApellido() +"', '"+DateUtil.convertirFecha()+"')";
		} else{
			sql = "INSERT INTO estudiantes (nombre, apellido, edad, fecha_modificacion) VALUES('" + estudiante.getNombre() + "','"
					+ estudiante.getApellido()+ "','" +estudiante.getEdad()+"', '"+DateUtil.convertirFecha()+"')";
		}
		try {
			stmt = conexion.createStatement();
			System.out.println(sql);
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		} finally {
			cerrarConexion();
		}
	}
	
	public void actualizarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("actualizando estudiante " + estudiante.toString());
		Statement stmt = null;
		String sql = "";
		if(estudiante.getEdad()==null){	
			sql = "UPDATE estudiantes SET nombre='"+estudiante.getNombre()+"', apellido='"+estudiante.getApellido()+"', fecha_modificacion='"+DateUtil.convertirFecha()+"' WHERE id='"+estudiante.getId()+"'";
		} else{
			sql = "UPDATE estudiantes SET nombre='"+estudiante.getNombre()+"', apellido='"+estudiante.getApellido()+"', edad='"+estudiante.getEdad()+"', fecha_modificacion='"+DateUtil.convertirFecha()+"' WHERE id='"+estudiante.getId()+"'";
		}
		try {
			stmt = conexion.createStatement();
			System.out.println(sql);
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		} finally {
			cerrarConexion();
		}
	}
}
