package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Alimentación;
import pe.edu.upc.service.IAlimentacionService;

@Named
@RequestScoped

public class AlimentacionController implements Serializable{

	private static final long serialVersionUID = -7622783490835450142L;

	@Inject
	private IAlimentacionService aService;
	private Alimentación alimentacion;
	List<Alimentación> listaAlimentacion;
	
	@PostConstruct
	public void init() {
		this.listaAlimentacion = new ArrayList<Alimentación>();
		this.alimentacion = new Alimentación();
		this.listar();
	}
	
	public String NuevaAlimentacion() {
		this.setAlimentacion(new Alimentación());
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
	
	
}
