package logical;

import java.util.Date;

public class Compra {
	
	
	private Suplidor miSuplidor;
	private Componente miComp;
	private int cantidad;
	private float precio;
	private float precioTotal;
	private Date fecha;
	
	public Compra(Suplidor miSuplidor, Componente miComp, int cantidad, float precio, Date fecha) {
		super();
		this.miSuplidor = miSuplidor;
		this.miComp = miComp;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fecha = fecha;
		this.precioTotal = cantidad * precio;
		
	}
	
	
	public float getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}


	public Suplidor getMiSuplidor() {
		return miSuplidor;
	}
	public void setMiSuplidor(Suplidor miSuplidor) {
		this.miSuplidor = miSuplidor;
	}
	public Componente getMiComp() {
		return miComp;
	}
	public void setMiComp(Componente miComp) {
		this.miComp = miComp;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


}
