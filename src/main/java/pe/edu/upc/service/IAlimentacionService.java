package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Alimentaci�n;

public interface IAlimentacionService {

	public void insertar(Alimentaci�n alimentacion);
	public List<Alimentaci�n> listar();
	public void eliminar(int idAlimentacion);
}
