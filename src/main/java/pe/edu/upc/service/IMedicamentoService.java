package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Medicamento;

public interface IMedicamentoService {
	public void insertar(Medicamento medicamento);
	public List<Medicamento> listar();
}
