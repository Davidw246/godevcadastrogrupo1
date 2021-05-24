package br.com.proway.senior.godevcadastrogrupo1.model.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.com.proway.senior.godevcadastrogrupo1.model.Empresa;
import br.com.proway.senior.godevcadastrogrupo1.persistence.DBConnection;

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
		int modificados = this.session.createSQLQuery("TRUNCATE empresa CASCADE")
				.executeUpdate();
		this.session.getTransaction().commit();
		return modificados > 0 ? true : false;
	}
	
	/**
	 * Buscar empresas por nome.
	 * 
	 * M�todo busca as empresas no banco de dados atrav�s dos seus respectivos nomes,
	 * � poss�vel passar um par�metro parcial para retorna todos os registros que contenham
	 * determinado texto em seu nomeEmpresa.
	 * 
	 * @param nomeEmpresa nome da(s) empresa(s) procuradas.
	 * @return resultados lista de registros localizados.
	 */
	public List<Empresa> buscarPorNome(String nomeEmpresa){
		Session session = DBConnection.getSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Empresa> criteria = criteriaBuilder.createQuery(Empresa.class);	
		Root<Empresa> root = criteria.from(Empresa.class);
		Expression<String> coluna = root.get("nomeEmpresa");
		String filtro = "%" + nomeEmpresa + "%";
		criteria.select(root).where(criteriaBuilder.like(coluna, filtro));	
		Query query = session.createQuery(criteria);
		List<Empresa> resultados = query.getResultList();
		return new ArrayList<Empresa>(resultados);
	}

}



	