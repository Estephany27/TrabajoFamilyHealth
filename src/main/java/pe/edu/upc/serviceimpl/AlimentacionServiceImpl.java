package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlimentacionDao;
import pe.edu.upc.entity.Alimentaci�n;
import pe.edu.upc.service.IAlimentacionService;


@Named
@RequestScoped

public class AlimentacionServiceImpl implements IAlimentacionService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IAlimentacionDao aD;
	
	@Override
	public void insertar(Alimentaci�n alimentacion) {
		aD.insertar(alimentacion);
		
	}

	@Override
	public List<Alimentaci�n> listar() {
		return aD.listar();
	}

	@Override
	public void eliminar(int idAlimentacion) {
		aD.eliminar(idAlimentacion);
		
	}
	

}
