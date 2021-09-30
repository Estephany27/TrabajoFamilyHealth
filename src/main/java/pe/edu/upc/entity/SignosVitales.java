package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne
	@JoinColumn(name="idPaciente",nullable=false)
	private Paciente paciente;

	public SignosVitales() {
		super();
	}

	public SignosVitales(int idSignosVitales, int saturacion, int presion, float temperatura, Date fechaMedicion,
			Paciente paciente) {
		super();
		this.idSignosVitales = idSignosVitales;
		this.saturacion = saturacion;
		this.presion = presion;
		this.temperatura = temperatura;
		this.fechaMedicion = fechaMedicion;
		this.paciente = paciente;
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaMedicion, idSignosVitales, paciente, presion, saturacion, temperatura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignosVitales other = (SignosVitales) obj;
		return Objects.equals(fechaMedicion, other.fechaMedicion) && idSignosVitales == other.idSignosVitales
				&& Objects.equals(paciente, other.paciente) && presion == other.presion
				&& saturacion == other.saturacion
				&& Float.floatToIntBits(temperatura) == Float.floatToIntBits(other.temperatura);
	}
		
	
}
