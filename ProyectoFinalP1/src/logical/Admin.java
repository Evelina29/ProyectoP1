package logical;

public class Admin extends Person {
	
	
	private static Tienda[] miTienda;

	static {
		miTienda = new  Tienda[10];
	}
	
	
	public Admin(String nombre, String apellido, String iD, String direccion) {
		super(nombre, apellido, iD, direccion);
		// TODO Auto-generated constructor stub
		
		
	}
	
	public void crearTienda() {
		
	}

}
