package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMedicamentoDao;
import pe.edu.upc.entity.Medicamento;
import pe.edu.upc.service.IMedicamentoService;

@Named
@RequestScoped

public class MedicamentoServiceImpl implements IMedicamentoService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IMedicamentoDao mD;
	
	@Override
	public void insertar(Medicamento medicamento) {
		mD.insertar(medicamento);
	}

	@Override
	public List<Medicamento> listar() {
		return mD.listar();
	}

}
