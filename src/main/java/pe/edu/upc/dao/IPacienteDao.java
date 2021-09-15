package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Paciente;

public interface IPacienteDao {
	
	public void insertar(Paciente paciente);
	public List<Paciente> listar();
	public void eliminar(int idPaciente);

}
