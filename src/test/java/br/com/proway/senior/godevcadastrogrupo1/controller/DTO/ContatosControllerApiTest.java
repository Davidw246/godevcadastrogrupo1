package br.com.proway.senior.godevcadastrogrupo1.controller.DTO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.hibernate.Session;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.proway.senior.godevcadastrogrupo1.model.Contatos;
import br.com.proway.senior.godevcadastrogrupo1.model.DAO.ContatosDAO;
import br.com.proway.senior.godevcadastrogrupo1.model.DTO.ContatosDTO;
import br.com.proway.senior.godevcadastrogrupo1.persistence.DBConnection;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContatosControllerApiTest {

	static Session session = DBConnection.getSession();
	static ContatosControllerApi contatosControllerApi;
	ContatosDAO daoContatos = ContatosDAO.getInstance(session);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ContatosDAO.getInstance(DBConnection.getSession()).deleteAll();
		contatosControllerApi = new ContatosControllerApi();
	}
	
	@Test
	public void testCriarContatos() throws Exception {
		Contatos contato = new Contatos("47988361245", "47988663322", "elton@gmail.com", "47332544579");
		ContatosDAO.getInstance(DBConnection.getSession()).create(contato);
		assertNotNull(contato);
	}
	
	@Test
	public void testDeletarContatos() throws Exception {
		Contatos contato = new Contatos("47988361245", "47988663322", "elton@gmail.com", "47332544579");
		ContatosDAO.getInstance(DBConnection.getSession()).delete(contato);
		assertNull(daoContatos.readById(contato.getId()));
	}

	@Test
	public void testABuscarContatosPorId() throws Exception {
		Contatos contato = new Contatos("47988361245", "47988663322", "elton@gmail.com", "47332544579");
		ContatosDAO.getInstance(DBConnection.getSession()).create(contato);

		ContatosDTO contatosDTO = contatosControllerApi.buscarContatosPorId(contato.getId());
		assertEquals("elton@gmail.com", contatosDTO.getEmail());
	}

	@Test
	public void testCBuscarTodosContatos() throws Exception {
		Contatos contato = new Contatos("47988361245", "47988663322", "junior@gmail.com", "3336548940");
		ContatosDAO.getInstance(DBConnection.getSession()).create(contato);

		Contatos contato2 = new Contatos("4789641230", "479885566441", "amanda@gmail.com", "4734567850");
		ContatosDAO.getInstance(DBConnection.getSession()).create(contato2);

		List<ContatosDTO> listaContatosDTO = contatosControllerApi.buscarTodosContatos();
		;
		assertEquals(4, listaContatosDTO.size());
	}

	@Test
	public void testBBuscarContatosPorEmail() throws Exception {
		Contatos contato = new Contatos("4788556644", "4789654120", "ricardinho@gmail.com", "47336515945");
		ContatosDAO.getInstance(DBConnection.getSession()).create(contato);

		List<ContatosDTO> listaContatosDTO = contatosControllerApi
				.buscarPrestadorServicoPorEmail("ricardinho@gmail.com");
		assertEquals(1, listaContatosDTO.size());
	}
}
