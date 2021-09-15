package pe.edu.upc.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Familiar;
import pe.edu.upc.service.IFamiliarService;

@Named
@RequestScoped

public class FamiliarController implements Serializable {


	private static final long serialVersionUID = 5499991930184761109L;

	@Inject
	private IFamiliarService fService;
	private Familiar familiar;
	
	@PostConstruct
	public void init() {
		this.familiar = new Familiar();
	}
	
	public String nuevoFamiliar() {
		this.setFamiliar(new Familiar());
		return "familiar.xhtml";
	}
	
	public void insertar() {
		fService.insertar(familiar);
		limpiarFamiliar();
	}
	
	public void limpiarFamiliar() {
		this.init();
	}

	public Familiar getFamiliar() {
		return familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}
	
	
}
