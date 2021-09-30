package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Alimentación;

public interface IAlimentacionDao {

	public void insertar(Alimentación alimentacion);
	public List<Alimentación> listar();
	public void eliminar (int idAlimentacion);
}
