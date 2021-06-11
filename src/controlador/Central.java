package controlador;

import vista.Login;
import vista.Register;
import vista.Tabla;

public class Central {
	
	

	public void abrirLogin() {
		
		new Login();
	}

	public void abrirTabla() {
	
		new Tabla();
		
	}

	public void abrirRegister() {
		
		new Register();
	}
	
}