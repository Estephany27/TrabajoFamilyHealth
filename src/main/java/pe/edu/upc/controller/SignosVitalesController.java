package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.SignosVitales;
import pe.edu.upc.service.ISignosVitalesService;

@Named
@RequestScoped

public class SignosVitalesController implements Serializable{

	private static final long serialVersionUID = 3198631808582046268L;

	@Inject
	private ISignosVitalesService svService;
	private SignosVitales signosvitales;
	List<SignosVitales> listaSignosVitales;
	
	@PostConstruct
	public void init() {
		this.listaSignosVitales = new ArrayList<SignosVitales>();
		this.signosvitales = new SignosVitales();
		this.listar();
	}
	
	public String nuevoSignosVitales() {
		this.setSignosvitales(new SignosVitales());
		return "signosvitales.xhtml";
	}
	
	public void insertar() {
		svService.insertar(signosvitales);
		limpiarSignosVitales();
	}
	
	public void listar() {
		listaSignosVitales =svService.listar();
	}
	
	public void limpiarSignosVitales() {
		this.init();
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
	
	
}
