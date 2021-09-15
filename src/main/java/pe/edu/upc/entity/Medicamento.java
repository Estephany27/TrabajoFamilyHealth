package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Medicamento")
public class Medicamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMedicamento;
	
	@Column(name="nombremedicamento",nullable=false,length=50)
	private String nombremedicamento;
	
	@ManyToOne
	@JoinColumn(name="id", nullable = false)
	private Medicacion medicacion;

	public Medicamento() {
		super();
	}

	public Medicamento(int idMedicamento, String nombremedicamento, Medicacion medicacion) {
		super();
		this.idMedicamento = idMedicamento;
		this.nombremedicamento = nombremedicamento;
		this.medicacion = medicacion;
	}

	public int getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNombremedicamento() {
		return nombremedicamento;
	}

	public void setNombremedicamento(String nombremedicamento) {
		this.nombremedicamento = nombremedicamento;
	}

	public Medicacion getMedicacion() {
		return medicacion;
	}

	public void setMedicacion(Medicacion medicacion) {
		this.medicacion = medicacion;
	}
	
	
	
}
