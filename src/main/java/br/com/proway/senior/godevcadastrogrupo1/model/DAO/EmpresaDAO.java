package br.com.proway.senior.godevcadastrogrupo1.model.DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;

import br.com.proway.senior.godevcadastrogrupo1.model.Empresa;

/**
 * EmpresaDAO.
 * 
 * Classe de intera��o com o banco de dados atrav�s do Hibernate.
 * Extende a classe {@Dao} que possui os m�todos create, update e delete.
 * Implementa a interface {@link InterfaceDao} com os m�todos de buscar.
 * 
 * @author Sprint 5
 * @author Sarah Neuburger Brito <b>sarah.brito@senior.com.br</b> - Sprint 6
 *
 */

public class EmpresaDAO extends Dao<Empresa> implements InterfaceDao<Empresa>{

	protected static EmpresaDAO instance;
	
	/**
	 * M�todo getInstance.
	 * 
	 * Verifica se j� h� uma sess�o instanciada e, caso n�o, inicia uma.
	 * 
	 * @param Session session.
	 * @return instance retorna a inst�ncia da conex�o.
	 */
	public static EmpresaDAO getInstance(Session session) {
		if (instance == null)
			instance = new EmpresaDAO(session);
		return instance;
	}

	/**
	 * Contrutor da classe que recebe uma Session como par�metro para conex�o com o 
	 * Hibernate.
	 * 
	 * @param Seseion session
	 */
	public EmpresaDAO(Session session) {
		this.session = session;
	}
	
	/**
	 * Buscar Empresa por Id
	 * 
	 * Busca no banco a Empresa com o id igual ao passado como parametro
	 * 
	 * @param id Da Empresa desejada
	 * @return Empresa desejado
	 */
	public Empresa readById(Integer id) {
		return session.get(Empresa.class, id);
	}
	
	/**
	 * Buscar tods os Endereços
	 * Busca no banco de dados tdos os endereços cadastrados
	 * 
	 * @return List Empresa, lista de empresas cadastradas.
	 */
	public List<Empresa> getAll() {
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Empresa> criteria = builder.createQuery(Empresa.class);
		criteria.from(Empresa.class);
		List<Empresa> empresa = session.createQuery(criteria).getResultList();
		return empresa;
	}
	
	/**
	 * Deletar todas as empresas.
	 * 
	 * M�todo deleta todos os registros de empresas constantes no banco de dados.
	 * 
	 * @return boolean
	 */
	public boolean deleteAll() {
		if (!this.session.getTransaction().isActive()) {
			this.session.beginTransaction();
		}
		int modificados = this.session.createSQLQuery("DELETE FROM empresa")
				.executeUpdate();
		this.session.getTransaction().commit();
		return modificados > 0 ? true : false;
	}
	
}



	