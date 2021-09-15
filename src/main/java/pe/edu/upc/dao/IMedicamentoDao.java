package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Medicamento;

public interface IMedicamentoDao {

	public void insertar(Medicamento medicamento);
	public List<Medicamento> listar();
}


