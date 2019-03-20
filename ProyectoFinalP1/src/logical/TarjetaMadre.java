package logical;

public class TarjetaMadre extends Componente{

	private String conexiones;
	
	
	public TarjetaMadre(String modelo, String marca, String tipo, float precio, int cantDisponible, String serie, String conexiones) {
		super(modelo, marca, tipo, precio, cantDisponible, serie);
		// TODO Auto-generated constructor stub
		
		this.conexiones = conexiones;
		
	}

	public String getConexiones() {
		return conexiones;
	}

	public void setConexiones(String conexiones) {
		this.conexiones = conexiones;
	}

}
