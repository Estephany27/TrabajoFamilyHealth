package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SignosVitales")
public class SignosVitales implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSignosVitales;
	
	@Column(name="saturacion", nullable= false, length=5)
	private int saturacion;
	
	@Column(name="presion", nullable= false, length=5)
	private int presion;
	
	@Column(name="temperatura", nullable= false, length=6)
	private float temperatura;
	
	private Date fechaMedicion;

	public SignosVitales() {
		super();
	}

	public SignosVitales(int idSignosVitales, int saturacion, int presion, float temperatura, Date fechaMedicion) {
		super();
		this.idSignosVitales = idSignosVitales;
		this.saturacion = saturacion;
		this.presion = presion;
		this.temperatura = temperatura;
		this.fechaMedicion = fechaMedicion;
	}

	public int getIdSignosVitales() {
		return idSignosVitales;
	}

	public void setIdSignosVitales(int idSignosVitales) {
		this.idSignosVitales = idSignosVitales;
	}

	public int getSaturacion() {
		return saturacion;
	}

	public void setSaturacion(int saturacion) {
		this.saturacion = saturacion;
	}

	public int getPresion() {
		return presion;
	}

	public void setPresion(int presion) {
		this.presion = presion;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public Date getFechaMedicion() {
		return fechaMedicion;
	}

	public void setFechaMedicion(Date fechaMedicion) {
		this.fechaMedicion = fechaMedicion;
	}
	
	
	
	
}
