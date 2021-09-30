package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMedicacionDao;
import pe.edu.upc.entity.Medicacion;
import pe.edu.upc.service.IMedicacionService;

@Named
@RequestScoped

public class MedicacionServiceImpl implements IMedicacionService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IMedicacionDao mD;
	
	@Override
	public void insertar(Medicacion medicacion) {
		mD.insertar(medicacion);
	}

	@Override
	public List<Medicacion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMedicacion) {
		mD.eliminar(idMedicacion);
	}

}
