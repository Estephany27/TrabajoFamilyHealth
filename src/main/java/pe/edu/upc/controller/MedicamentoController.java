package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Medicacion;
import pe.edu.upc.entity.Medicamento;

import pe.edu.upc.service.IMedicacionService;
import pe.edu.upc.service.IMedicamentoService;

@Named
@RequestScoped

public class MedicamentoController implements Serializable{

	private static final long serialVersionUID = -3339009707497874610L;

	@Inject
	private IMedicacionService mService;
	private Medicacion medicacion;
	List<Medicacion> listaMedicacion;
	
	@Inject
	private IMedicamentoService meService;
	private Medicamento medicamento;
	List<Medicamento> listaMedicamento;
	
	@PostConstruct
	public void init() {
		this.listaMedicacion = new ArrayList<Medicacion>();
		this.listaMedicamento = new ArrayList<Medicamento>();
		
		this.medicacion = new Medicacion();
		this.medicamento = new Medicamento();
		
		this.listar();
		this.listarMedicamento();
	}
	
	public String nuevaMedicamento() {
		this.setMedicamento(new Medicamento());
		return "medicamento.xhtml";
	}
	
	public void insertar() {
		meService.insertar(medicamento);
		limpiarMedicamento();
	}
	
	public void listar() {
		listaMedicacion = mService.listar();
	}
	
	public void listarMedicamento() {
		listaMedicamento = meService.listar();
	}
	
	public void limpiarMedicamento() {
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

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public List<Medicamento> getListaMedicamento() {
		return listaMedicamento;
	}

	public void setListaMedicamento(List<Medicamento> listaMedicamento) {
		this.listaMedicamento = listaMedicamento;
	}

	
	
	
}
