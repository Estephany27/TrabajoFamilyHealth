package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPacienteDao;
import pe.edu.upc.entity.Paciente;

public class PacienteDaoImpl implements IPacienteDao,Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Paciente paciente) {
		em.persist(paciente);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> listar() {
		List<Paciente> lista = new ArrayList<Paciente>();
		Query q = em.createQuery("select m from Paciente m");
		lista= (List<Paciente>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idPaciente) {
		Paciente paciente = new Paciente ();
		paciente= em.getReference(Paciente.class, idPaciente);
		em.remove(paciente);
	}

	
	
}
