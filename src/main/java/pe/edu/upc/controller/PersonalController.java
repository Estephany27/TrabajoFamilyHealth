package pe.edu.upc.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Personal;
import pe.edu.upc.service.IPersonalService;

@Named
@RequestScoped

public class PersonalController implements Serializable{

	private static final long serialVersionUID = -9008048735170107557L;
	
	@Inject
	private IPersonalService pService;
	private Personal personal;
	
	@PostConstruct
	public void init() {
		this.personal=new Personal();
	}
	
	public String nuevoPersonal() {
		this.setPersonal(new Personal());
		return "personal.xhtm";
	}
	
	public void insertar() {
		pService.insertar(personal);
		limpiarPersonal();
	}
	
	public void limpiarPersonal() {
		this.init();
	}
	
	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
}
