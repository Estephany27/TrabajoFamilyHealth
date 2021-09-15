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
@Table(name="Alimentacion")
public class Alimentación implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAlimentacion;
	
	@Column(name="tipodieta", nullable=false,length=30)
	private String tipodieta;
	
	@Column(name="horario",nullable=false,length=50)
	private String horario;
	
	private Date fecha;

	public Alimentación() {
		super();
	}

	public Alimentación(int idAlimentacion, String tipodieta, String horario, Date fecha) {
		super();
		this.idAlimentacion = idAlimentacion;
		this.tipodieta = tipodieta;
		this.horario = horario;
		this.fecha = fecha;
	}

	public int getIdAlimentacion() {
		return idAlimentacion;
	}

	public void setIdAlimentacion(int idAlimentacion) {
		this.idAlimentacion = idAlimentacion;
	}

	public String getTipodieta() {
		return tipodieta;
	}

	public void setTipodieta(String tipodieta) {
		this.tipodieta = tipodieta;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
