package main;

import bbdd.conexion;
import vista.Inicio;
import vista.Login;
import vista.Register;
import vista.Tabla;

public class Main {

	public static void main(String[] args) {

		conexion.conectar();
		new Inicio();
		
	}

}
