package modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Alumno;

public class Usuarios {

	public void crearAlumno(Alumno alumno) {
		String nombre = alumno.getNombre();
		Date fechaNacimiento = alumno.getFechaNacimiento();

		conexion.ejecutarUpdate("INSERT INTO alumnos (nombre, fecha_nacimiento) VALUES ('"+nombre+"', '"+fechaNacimiento+"');");
		
	}
	
	public ArrayList<Alumno> recogerAlumnos(){
	
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ResultSet resultado = conexion.ejecutarSentencia("SELECT * FROM alumnos;");
		try {
			while(resultado.next()) {
				int id = resultado.getInt("id");
				String nombre = resultado.getString("nombre");
				Date fechaNacimiento = resultado.getDate("fecha_nacimiento");
				alumnos.add(new Alumno(id, nombre, fechaNacimiento));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alumnos;
	}
	
	public void borrarAlumno(int idAlumno) {
		conexion.ejecutarUpdate("DELETE FROM alumnos WHERE id="+idAlumno+";");
	}

	public void modificarAlumno(Alumno alumno) {
		int id = alumno.getId();
		String nombre = alumno.getNombre();
		Date fechaNacimiento = alumno.getFechaNacimiento();
		
		conexion.ejecutarUpdate("UPDATE alumnos SET nombre='"+nombre+"', fecha_nacimiento='"+fechaNacimiento+"' WHERE id="+id+";");
		
	}
}
