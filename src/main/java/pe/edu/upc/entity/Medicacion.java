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

	@ManyToOne
	@JoinColumn(name="idPaciente",nullable=false)
	private Paciente paciente;

	public Medicacion() {
		super();
	}

	public Medicacion(int idMedicacion, String nombremedicina, String nombredoctor, String estadomedicina,
			Date fechaEmision, Paciente paciente) {
		super();
		this.idMedicacion = idMedicacion;
		this.nombremedicina = nombremedicina;
		this.nombredoctor = nombredoctor;
		this.estadomedicina = estadomedicina;
		FechaEmision = fechaEmision;
		this.paciente = paciente;
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(FechaEmision, estadomedicina, idMedicacion, nombredoctor, nombremedicina, paciente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicacion other = (Medicacion) obj;
		return Objects.equals(FechaEmision, other.FechaEmision) && Objects.equals(estadomedicina, other.estadomedicina)
				&& idMedicacion == other.idMedicacion && Objects.equals(nombredoctor, other.nombredoctor)
				&& Objects.equals(nombremedicina, other.nombremedicina) && Objects.equals(paciente, other.paciente);
	}
	
	
	
}
