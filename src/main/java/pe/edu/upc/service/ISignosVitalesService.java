package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.SignosVitales;

public interface ISignosVitalesService {

	public void insertar(SignosVitales signosvitales);
	public List<SignosVitales> listar();
	public void eliminar(int idSignosVitales);
}
