package logical;

public class Admin extends Person {
	
	
	private static Tienda[] miTienda;
	private static int cantTienda;

	static {
		miTienda = new  Tienda[10];
		cantTienda =0;
		
	}
	
	
	public Admin(String nombre, String apellido, String iD, String direccion) {
		super(nombre, apellido, iD, direccion);
		
		
		
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

}
