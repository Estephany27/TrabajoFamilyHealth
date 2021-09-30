package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Medicacion;
import pe.edu.upc.entity.Paciente;
import pe.edu.upc.service.IMedicacionService;
import pe.edu.upc.service.IPacienteService;

@Named
@RequestScoped

public class MedicacionController implements Serializable{

	private static final long serialVersionUID = -3339009707497874610L;

	@Inject
	private IMedicacionService mService;
	private Medicacion medicacion;
	List<Medicacion> listaMedicacion;
	
	@Inject 
	private IPacienteService paService;
	private Paciente paciente;
	List<Paciente> listaPaciente;
	
	@PostConstruct
	public void init() {
		this.listaMedicacion = new ArrayList<Medicacion>();
		this.listaPaciente = new ArrayList<Paciente>();
		this.paciente = new Paciente();
		this.medicacion = new Medicacion();
		this.listar();
		this.listMedicacion();
	}
	
	public String nuevaMedicacion() {
		this.setMedicacion(new Medicacion());
		return "medicacion.xhtml";
	}
	
	public void insertar() {
		mService.insertar(medicacion);
		limpiarMedicacion();
		this.listMedicacion();
	}
	
	public void listar() {
		listaPaciente =paService.listar();
	}
	
	public void listMedicacion() {
		listaMedicacion = mService.listar();
	}
	
	public void limpiarMedicacion() {
		this.init();
	}
	
	public void eliminar(Medicacion medicacion) {
		mService.eliminar(medicacion.getIdMedicacion());
		this.listar();
	}

	public Medicacion getMedicacion() {
		return medicacion;
	}

	public void setMedicacion(Medicacion medicacion) {
		this.medicacion = medicacion;
	}

	public List<Medicacion> getListaMedicacion() {
		return listaMedicacion;
	}

	public void setListaMedicacion(List<Medicacion> listaMedicacion) {
		this.listaMedicacion = listaMedicacion;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getListaPaciente() {
		return listaPaciente;
	}

	public void setListaPaciente(List<Paciente> listaPaciente) {
		this.listaPaciente = listaPaciente;
	}

	
}
