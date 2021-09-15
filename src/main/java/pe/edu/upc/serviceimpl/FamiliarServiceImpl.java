package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFamiliarDao;
import pe.edu.upc.entity.Familiar;
import pe.edu.upc.service.IFamiliarService;


@Named
@RequestScoped

public class FamiliarServiceImpl implements IFamiliarService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IFamiliarDao fD;
		
	@Override
	public void insertar(Familiar familiar) {
		fD.insertar(familiar);		
	}
}
