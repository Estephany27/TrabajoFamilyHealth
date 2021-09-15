package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Medicacion;
import pe.edu.upc.service.IMedicacionService;

@Named
@RequestScoped

public class MedicacionController implements Serializable{

	private static final long serialVersionUID = -3339009707497874610L;

	@Inject
	private IMedicacionService mService;
	private Medicacion medicacion;
	List<Medicacion> listaMedicacion;
	
	@PostConstruct
	public void init() {
		this.listaMedicacion = new ArrayList<Medicacion>();
		this.medicacion = new Medicacion();
		this.listar();
	}
	
	public String nuevaMedicacion() {
		this.setMedicacion(new Medicacion());
		return "medicacion.xhtml";
	}
	
	public void insertar() {
		mService.insertar(medicacion);
		limpiarMedicacion();
	}
	
	public void listar() {
		listaMedicacion = mService.listar();
	}
	
	public void limpiarMedicacion() {
		this.init();
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
	
	
}
