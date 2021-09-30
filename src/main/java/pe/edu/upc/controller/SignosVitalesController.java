package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Paciente;
import pe.edu.upc.entity.SignosVitales;
import pe.edu.upc.service.IPacienteService;
import pe.edu.upc.service.ISignosVitalesService;

@Named
@RequestScoped

public class SignosVitalesController implements Serializable{

	private static final long serialVersionUID = 3198631808582046268L;

	@Inject
	private ISignosVitalesService svService;
	private SignosVitales signosvitales;
	List<SignosVitales> listaSignosVitales;
	
	@Inject 
	private IPacienteService paService;
	private Paciente paciente;
	List<Paciente> listaPaciente;

	@PostConstruct
	public void init() {
		this.listaSignosVitales = new ArrayList<SignosVitales>();
		this.listaPaciente = new ArrayList<Paciente>();
		this.paciente = new Paciente();
		this.signosvitales = new SignosVitales();
		this.listar();
		this.listSignosVitales();
		
	}
	
	public String nuevoSignosVitales() {
		this.setSignosvitales(new SignosVitales());
		return "SignosVitales.xhtml";
	}
	
	public void insertar() {
		svService.insertar(signosvitales);
		limpiarSignosVitales();
		this.listSignosVitales();
	}
	
	public void listar() {
		listaPaciente =paService.listar();
	}
	
	public void listSignosVitales() {
		listaSignosVitales = svService.listar();
	}
	
	public void limpiarSignosVitales() {
		this.init();
	}

	public void eliminar(SignosVitales signosvitales) {
		svService.eliminar(signosvitales.getIdSignosVitales());
		this.listar();
	}
	
	public SignosVitales getSignosvitales() {
		return signosvitales;
	}

	public void setSignosvitales(SignosVitales signosvitales) {
		this.signosvitales = signosvitales;
	}

	public List<SignosVitales> getListaSignosVitales() {
		return listaSignosVitales;
	}

	public void setListaSignosVitales(List<SignosVitales> listaSignosVitales) {
		this.listaSignosVitales = listaSignosVitales;
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
