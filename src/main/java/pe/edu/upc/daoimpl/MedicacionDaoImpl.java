package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMedicacionDao;
import pe.edu.upc.entity.Medicacion;

public class MedicacionDaoImpl implements IMedicacionDao,Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Medicacion medicacion) {
		em.persist(medicacion);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medicacion> listar() {
		List<Medicacion> lista = new ArrayList<Medicacion>();
		Query q = em.createQuery("select m from Medicacion m");
		lista = (List<Medicacion>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idMedicacion) {
		Medicacion medicacion = new Medicacion();
		medicacion=em.getReference(Medicacion.class, idMedicacion);
		em.remove(medicacion);
	}
	

}
