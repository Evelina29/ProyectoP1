package logical;

public class Vendedor extends Person {
	

	private String Contrasena;
	private String nombreTienda;
	private String estado;
	
	public Vendedor(String nombre, String apellido, String iD, String direccion,String contrasena,String nombreTienda) {
		super(nombre, apellido, iD, direccion);
		this.Contrasena = contrasena;
		this.setNombreTienda(nombreTienda);
		// TODO Auto-generated constructor stub
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	

}
