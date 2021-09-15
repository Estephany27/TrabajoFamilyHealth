package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISignosVitalesDao;
import pe.edu.upc.entity.SignosVitales;

public class SignosVitalesDaoImpl implements ISignosVitalesDao,Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName ="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(SignosVitales signosvitales) {
		em.persist(signosvitales);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SignosVitales> listar() {
		List<SignosVitales> lista = new ArrayList<SignosVitales>();
		Query q =em.createQuery("select m from SignosVitales sv");
		lista = (List<SignosVitales>) q.getResultList();
		return lista;
	}

	
}
