package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPersonalDao;
import pe.edu.upc.entity.Personal;
import pe.edu.upc.service.IPersonalService;

@Named
@RequestScoped

public class PersonalServiceImpl implements IPersonalService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IPersonalDao pD;
	
	@Override
	public void insertar(Personal personal) {
		pD.insertar(personal);
	}
}
