package logical;

public abstract class Componente {
	
	
	protected String modelo;
	protected String marca;
	protected String tipo;
	protected float precio;
	protected int cantDisponible;
	protected int cantMinimal;
	protected String serie;
	protected String nombre;
	
	public Componente(String modelo, String marca, String tipo, float precio, int cantDisponible, String serie) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.tipo = tipo;
		this.precio = precio;
		this.cantDisponible = cantDisponible;
		this.serie = serie;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public int getCantMinimal() {
		return cantMinimal;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}



	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCantDisponible() {
		return cantDisponible;
	}
	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	

	
}
