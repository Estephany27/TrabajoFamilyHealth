package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISignosVitalesDao;
import pe.edu.upc.entity.SignosVitales;
import pe.edu.upc.service.ISignosVitalesService;

@Named
@RequestScoped

public class SignosVitalesServiceImpl implements ISignosVitalesService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ISignosVitalesDao svD;

	@Override
	public void insertar(SignosVitales signosvitales) {
		svD.insertar(signosvitales);
		
	}

	@Override
	public List<SignosVitales> listar() {
		return svD.listar();
	}

	
}
