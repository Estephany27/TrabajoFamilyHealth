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
@Table(name="Medicacion")
public class Medicacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMedicacion;
	
	@Column(name="nombremedicina",nullable=false,length=50)
	private String nombremedicina;
	
	@Column(name="nombredoctor",nullable=false,length=50)
	private String nombredoctor;
	
	@Column(name="estadomedicina",nullable=false,length=30)
	private String estadomedicina;
	
	private Date FechaEmision;

	public Medicacion() {
		super();
	}

	public Medicacion(int idMedicacion, String nombremedicina, String nombredoctor, String estadomedicina,
			Date fechaEmision) {
		super();
		this.idMedicacion = idMedicacion;
		this.nombremedicina = nombremedicina;
		this.nombredoctor = nombredoctor;
		this.estadomedicina = estadomedicina;
		FechaEmision = fechaEmision;
	}

	public int getIdMedicacion() {
		return idMedicacion;
	}

	public void setIdMedicacion(int idMedicacion) {
		this.idMedicacion = idMedicacion;
	}

	public String getNombremedicina() {
		return nombremedicina;
	}

	public void setNombremedicina(String nombremedicina) {
		this.nombremedicina = nombremedicina;
	}

	public String getNombredoctor() {
		return nombredoctor;
	}

	public void setNombredoctor(String nombredoctor) {
		this.nombredoctor = nombredoctor;
	}

	public String getEstadomedicina() {
		return estadomedicina;
	}

	public void setEstadomedicina(String estadomedicina) {
		this.estadomedicina = estadomedicina;
	}

	public Date getFechaEmision() {
		return FechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		FechaEmision = fechaEmision;
	}
	
	
	
}
