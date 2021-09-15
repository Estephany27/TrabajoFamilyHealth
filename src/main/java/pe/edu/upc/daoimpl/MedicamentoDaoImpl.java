package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMedicamentoDao;
import pe.edu.upc.entity.Medicamento;

public class MedicamentoDaoImpl implements IMedicamentoDao,Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Medicamento medicamento) {
		em.persist(medicamento);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medicamento> listar() {
		List<Medicamento> lista = new ArrayList<Medicamento>();
		Query q = em.createQuery("select m from Medicacion m");
		lista = (List<Medicamento>) q.getResultList();
		return lista;
	}
	

}
