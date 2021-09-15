package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Familiar")

public class Familiar implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idFamiliar;
	
	@Column(name="nombre", nullable=false, length=50)
	private String nombre;

	@Column(name="apellido", nullable=false, length=50)
	private String apellido;
	
	@Column(name="correo", nullable=false, length=50)
	private String correo;
	
	@Column(name="contraseña", nullable=false, length=50)
	private String contraseña;

	@Column(name="dni", nullable=false, length=8)
	private int dni;
	
	@Column(name="telefono", nullable=false, length=9)
	private int telefono;
	
	public Familiar() {
		super();
	}
	
	public Familiar (int idFamiliar, String nombre, String apellido, int dni, String correo,
			String contraseña, int telefono) {
		super();
		this.idFamiliar = idFamiliar;
		this.nombre= nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.correo= correo;
		this.contraseña= contraseña;
		this.telefono=telefono;	
	}

	public int getIdFamiliar() {
		return idFamiliar;
	}

	public void setIdFamiliar(int idFamiliar) {
		this.idFamiliar = idFamiliar;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
		
}
