package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Alimentaci�n;
import pe.edu.upc.service.IAlimentacionService;

@Named
@RequestScoped

public class AlimentacionController implements Serializable{

	private static final long serialVersionUID = -7622783490835450142L;

	@Inject
	private IAlimentacionService aService;
	private Alimentaci�n alimentacion;
	List<Alimentaci�n> listaAlimentacion;
	
	@PostConstruct
	public void init() {
		this.listaAlimentacion = new ArrayList<Alimentaci�n>();
		this.alimentacion = new Alimentaci�n();
		this.listar();
	}
	
	public String NuevaAlimentacion() {
		this.setAlimentacion(new Alimentaci�n());
		return "alimentacion.xhtml";
	}
	
	public void insertar() {
		 aService.insertar(alimentacion);
		 limpiarAlimentacion();
	}
	
	public void listar() {
		listaAlimentacion = aService.listar();
	}
	
	public void limpiarAlimentacion() {
		this.init();
	}

	public Alimentaci�n getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(Alimentaci�n alimentacion) {
		this.alimentacion = alimentacion;
	}

	public List<Alimentaci�n> getListaAlimentacion() {
		return listaAlimentacion;
	}

	public void setListaAlimentacion(List<Alimentaci�n> listaAlimentacion) {
		this.listaAlimentacion = listaAlimentacion;
	}
	
	
}
