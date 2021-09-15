package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPacienteDao;
import pe.edu.upc.entity.Paciente;
import pe.edu.upc.service.IPacienteService;

@Named
@RequestScoped


public class PacienteServiceImpl implements IPacienteService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IPacienteDao paD;
	
	@Override
	public void insertar(Paciente paciente) {
		paD.insertar(paciente);
		
	}

	@Override
	public List<Paciente> listar() {
		return paD.listar();
	}

	@Override
	public void eliminar(int idPaciente) {
		paD.eliminar(idPaciente);
		
	}

}
