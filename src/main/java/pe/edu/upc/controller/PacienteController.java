package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Paciente;
import pe.edu.upc.service.IPacienteService;

@Named
@RequestScoped

public class PacienteController{

	@Inject
	private IPacienteService paService;
	private Paciente paciente;
	List<Paciente> listaPaciente;
	
	@PostConstruct
	public void init() {
		this.listaPaciente = new ArrayList<Paciente>();
		this.paciente = new Paciente();
		this.listar();
	}
	
	public String nuevoPaciente() {
		this.setPaciente(new Paciente());
		return "paciente.xhtml";
	}
	
	public void insertar() {
		paService.insertar(paciente);
		limpiarPaciente();
	}
	
	public void listar() {
		listaPaciente = paService.listar();
	}
	
	public void limpiarPaciente() {
		this.init();
	}
	
	public void eliminar(Paciente paciente) {
		paService.eliminar(paciente.getIdPaciente());
		this.listar();
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
