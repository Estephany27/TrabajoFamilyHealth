package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Paciente;

public interface IPacienteService {

	public void insertar(Paciente paciente);
	public List<Paciente> listar();
	public void eliminar(int idPaciente);
}
