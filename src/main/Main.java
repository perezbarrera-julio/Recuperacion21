package main;

import bbdd.conexion;
import vista.Inicio;
import vista.Login;
import vista.Register;

public class Main {

	public static void main(String[] args) {

		conexion.Conectar();
		new Inicio();
		new Login();
		new Register();
		
	}

}
