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
@Table(name="Paciente")
public class Paciente implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idPaciente;
	
	@Column(name="nombre", nullable=false, length=50)
	private String nombre;
	
	@Column(name="apellido", nullable=false, length=50)
	private String apellido;
	
	@Column(name="dni", nullable=false, length=8)
	private int dni;
	
	@Column(name="cama", nullable=false, length=4)
	private int cama;
	
	private Date fechaentrada;
	
	@Column(name="saturacion", nullable=false, length=5)
	private int saturacion;
	
	public Paciente() {
		super();
	}
	
	public Paciente(String nombre, String apellido, int dni,int cama, Date fechaentrada,
			int saturacion, int idPaciente) {
	super();
	this.idPaciente= idPaciente;
	this.nombre= nombre;
	this.apellido= apellido;
	this.dni= dni;
	this.cama= cama;
	this.fechaentrada= fechaentrada;
	this.saturacion = saturacion;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCama() {
		return cama;
	}

	public void setCama(int cama) {
		this.cama = cama;
	}

	public Date getFechaentrada() {
		return fechaentrada;
	}

	public void setFechaentrada(Date fechaentrada) {
		this.fechaentrada = fechaentrada;
	}

	public int getSaturacion() {
		return saturacion;
	}

	public void setSaturacion(int saturacion) {
		this.saturacion = saturacion;
	}
	
	
}
