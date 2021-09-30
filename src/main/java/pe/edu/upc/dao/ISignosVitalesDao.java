package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.SignosVitales;

public interface ISignosVitalesDao {
	
	public void insertar(SignosVitales signosvitales);
	public List<SignosVitales> listar();
	public void eliminar(int idSignosVitales);

}
