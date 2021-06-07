package beans;

public class Infousu {
	
	
	private int ID;
    private String Contrasena;
    private String Usuario;
   
    public Infousu(String usuario2, String contrasena2) {
		
	}
	public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getUsuario() {
    	return Usuario;
    }
    public void setUsuario(String usuario) {
    	this.Usuario = usuario;
    }
    public String getContrasena() {
        return Contrasena;
    }
    public void setContrasena(String contrasena) {
        this.Contrasena = contrasena;
    }
}
