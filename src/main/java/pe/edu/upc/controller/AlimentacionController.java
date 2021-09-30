package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Alimentación;
import pe.edu.upc.entity.Paciente;
import pe.edu.upc.service.IAlimentacionService;
import pe.edu.upc.service.IPacienteService;

@Named
@RequestScoped

public class AlimentacionController implements Serializable{

	private static final long serialVersionUID = -7622783490835450142L;

	@Inject
	private IAlimentacionService aService;
	private Alimentación alimentacion;
	List<Alimentación> listaAlimentacion;
	
	@Inject
	private IPacienteService paService;
	private Paciente paciente;
	List<Paciente> listaPaciente;
	
	@PostConstruct
	public void init() {
		this.listaAlimentacion= new ArrayList<Alimentación>();
		this.listaPaciente = new ArrayList<Paciente>();
		this.paciente = new Paciente();
		this.alimentacion = new Alimentación();
		this.listar();
		this.listAlimentacion();
	}
	
	public String NuevaAlimentacion() {
		this.setAlimentacion(new Alimentación());
		return "alimentacion.xhtml";
	}
	
	public void insertar() {
		 aService.insertar(alimentacion);
		 limpiarAlimentacion();
		 this.listAlimentacion();
	}
	
	public void listar() {
		listaPaciente = paService.listar();
	}
	
	public void listAlimentacion() {
		listaAlimentacion = aService.listar();
	}
	
	public void limpiarAlimentacion() {
		this.init();
	}

	public void eliminar(Alimentación alimentacion) {
		aService.eliminar(alimentacion.getIdAlimentacion());
		this.listar();
	}
	
	public Alimentación getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(Alimentación alimentacion) {
		this.alimentacion = alimentacion;
	}

	public List<Alimentación> getListaAlimentacion() {
		return listaAlimentacion;
	}

	public void setListaAlimentacion(List<Alimentación> listaAlimentacion) {
		this.listaAlimentacion = listaAlimentacion;
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
