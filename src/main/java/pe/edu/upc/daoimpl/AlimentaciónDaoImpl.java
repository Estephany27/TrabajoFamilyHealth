package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlimentacionDao;
import pe.edu.upc.entity.Alimentación;

public class AlimentaciónDaoImpl implements IAlimentacionDao,Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Alimentación alimentacion) {
		em.persist(alimentacion);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Alimentación> listar() {
		List<Alimentación> lista = new ArrayList<Alimentación>();
		Query q = em.createQuery("select m from Alimentación m");
		lista = (List<Alimentación>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idAlimentacion) {
		Alimentación alimentacion = new Alimentación();
		alimentacion= em.getReference(Alimentación.class, idAlimentacion);
		em.remove(alimentacion);
	}
	
}
