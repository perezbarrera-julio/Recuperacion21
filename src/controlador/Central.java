package controlador;

import java.sql.Date;
import java.util.ArrayList;

import beans.Alumno;
import modelo.Usuarios;
import vista.Formulario;
import vista.FormularioModificar;
import vista.Login;
import vista.Register;
import vista.Tabla;

public class Central {

	public void abrirFormularioAlumno() {
		new Formulario();
		
	}

	public void crearAlumno(String nombre, Date fechaNacimiento) {
		Alumno alumno = new Alumno(-1, nombre, fechaNacimiento);
		new Usuarios().crearAlumno(alumno);
		
	}
	
	public ArrayList<Alumno> recogerTodosAlumnos(){
		ArrayList<Alumno> alumnos = new Usuarios().recogerAlumnos();
		return alumnos;
	}
	
	public void borrarAlumno(int id) {
		new Usuarios().borrarAlumno(id);
	}

	public void modificarAlumno(Alumno alumno) {
		new Usuarios().modificarAlumno(alumno);
	}

	public void AbrirFormularioAlumnoModificar(Alumno alumno) {
		new FormularioModificar(alumno);
	}

	public void abrirTabla() {
		new Tabla();
		
	}

	public void abrirLogin() {
		new Login();
	}

	public void abrirRegister() {
		new Register();
	}
	
}
