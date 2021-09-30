package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Medicacion;

public interface IMedicacionDao {

	public void insertar(Medicacion medicacion);
	public List<Medicacion> listar();
	public void eliminar(int idMedicacion);
}
