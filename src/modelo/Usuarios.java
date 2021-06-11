package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Infousu;
import beans.Arma;

public class Usuarios {
	
	public Usuarios(ArrayList<Usuarios> usuarios, String contrasena, String us) {}

	public Usuarios() {} 
	
	public Usuarios(String usuario, String contrasena) {}

	public void insertarUsuario( String nombre, String contrasena) {
		
		String usuario = nombre;
		String Contrasena = contrasena;

		conexion.EjecutarUpdate("INSERT INTO infousu (nombre) VALUES ('"+nombre+"');");
	}
	
	public Infousu recogerUsuarios(String usuario, String contrasena) {
		ResultSet resultado = conexion.EjecutarSentencia("select * from infousu where usuario='"+usuario+"' and contrasena='"+contrasena+"';");
		try {
			while(resultado.next()) {
		
				String Usuario = resultado.getString("usuario");
				String Contrasena = resultado.getString("contrasena");
				Infousu infousuRecogido = new Infousu (usuario, contrasena);
				return infousuRecogido;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList<Infousu> recogerTodosUsuarios(){
		ArrayList<Infousu> infousu = new ArrayList<Infousu>();
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM infousu;");
		try {
			while(resultado.next()) {
				String nombre = resultado.getString("nombre");
				String contrasena = resultado.getString("contrasena");
				infousu.add(new Infousu(nombre, contrasena));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infousu;
	}


}
