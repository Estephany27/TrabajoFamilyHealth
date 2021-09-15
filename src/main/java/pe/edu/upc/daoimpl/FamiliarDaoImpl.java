package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFamiliarDao;
import pe.edu.upc.entity.Familiar;

public class FamiliarDaoImpl implements IFamiliarDao,Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Familiar familiar) {
		em.persist(familiar);
	}
}
