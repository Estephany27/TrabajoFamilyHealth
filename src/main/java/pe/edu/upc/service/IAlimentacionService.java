package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Alimentación;

public interface IAlimentacionService {

	public void insertar(Alimentación alimentacion);
	public List<Alimentación> listar();
	public void eliminar(int idAlimentacion);
}
