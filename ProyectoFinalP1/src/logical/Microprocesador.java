package logical;

public class Microprocesador extends Componente {
	
	private String velocidad;

	public Microprocesador(String modelo, String marca, String tipo, float precio, int cantDisponible, String serie,String velocidad) {
		super(modelo, marca, tipo, precio, cantDisponible, serie);
		
		this.velocidad = velocidad;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

}
