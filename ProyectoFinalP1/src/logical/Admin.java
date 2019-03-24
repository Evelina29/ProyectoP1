package logical;

public class Admin extends Person {
	
	private String contrasena;
	private String fechaNacimiento;
	private static Tienda[] miTienda;
	public static int cantTienda;
	
	static {
		miTienda = new  Tienda[10];
		cantTienda =0;
		
	}
	public void resetApplicationCompleto() {
		miTienda = new Tienda[10];
	}
	
	
	
	public Admin(String nombre, String apellido, String iD, String direccion,String contrasena,String fechaNacimiento) {
		super(nombre, apellido, iD, direccion);
		this.setContrasena(contrasena);
		this.fechaNacimiento = fechaNacimiento;
		
		
	}
	
	public void crearTienda(Tienda tienda) {
		miTienda[cantTienda]=tienda;
		cantTienda++;
		
	}

	public static Tienda[] getMiTienda() {
		return miTienda;
	}

	public static int getCantTienda() {
		return cantTienda;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
