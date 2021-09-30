package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlimentacionDao;
import pe.edu.upc.entity.Alimentaci�n;

public class Alimentaci�nDaoImpl implements IAlimentacionDao,Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Alimentaci�n alimentacion) {
		em.persist(alimentacion);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Alimentaci�n> listar() {
		List<Alimentaci�n> lista = new ArrayList<Alimentaci�n>();
		Query q = em.createQuery("select m from Alimentaci�n m");
		lista = (List<Alimentaci�n>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idAlimentacion) {
		Alimentaci�n alimentacion = new Alimentaci�n();
		alimentacion= em.getReference(Alimentaci�n.class, idAlimentacion);
		em.remove(alimentacion);
	}
	
}
