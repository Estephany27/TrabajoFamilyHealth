package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPersonalDao;
import pe.edu.upc.entity.Personal;

public class PersonalDaoImpl implements IPersonalDao, Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Personal personal) {
		em.persist(personal);
	}
}
