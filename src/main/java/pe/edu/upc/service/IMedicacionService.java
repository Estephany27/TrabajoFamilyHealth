package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Medicacion;

public interface IMedicacionService {
	public void insertar(Medicacion medicacion);
	public List<Medicacion> listar();
	public void eliminar(int idMedicacion);
}
