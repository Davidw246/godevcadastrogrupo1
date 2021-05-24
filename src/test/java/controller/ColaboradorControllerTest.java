package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.proway.senior.godevcadastrogrupo1.controller.ColaboradorController;
import br.com.proway.senior.godevcadastrogrupo1.model.Colaborador;
import br.com.proway.senior.godevcadastrogrupo1.model.Conta;
import br.com.proway.senior.godevcadastrogrupo1.model.Contatos;
import br.com.proway.senior.godevcadastrogrupo1.model.Dependente;
import br.com.proway.senior.godevcadastrogrupo1.model.Endereco;
import br.com.proway.senior.godevcadastrogrupo1.model.ExameMedico;
import br.com.proway.senior.godevcadastrogrupo1.model.DAO.ColaboradorDAO;
import br.com.proway.senior.godevcadastrogrupo1.model.DAO.ContaDAO;
import br.com.proway.senior.godevcadastrogrupo1.model.DAO.ContatosDAO;
import br.com.proway.senior.godevcadastrogrupo1.model.DAO.DependenteDAO;
import br.com.proway.senior.godevcadastrogrupo1.model.DAO.EnderecoDAO;
import br.com.proway.senior.godevcadastrogrupo1.model.DAO.ExameMedicoDAO;
import br.com.proway.senior.godevcadastrogrupo1.persistence.DBConnection;
import br.com.proway.senior.godevcadastrogrupo1.utils.EnumDadosPessoais;
import br.com.proway.senior.godevcadastrogrupo1.utils.EnumDadosPessoais.IdentidadeGenero;
import br.com.proway.senior.godevcadastrogrupo1.utils.EnumDadosPessoais.TiposDependentes;
import br.com.proway.senior.godevcadastrogrupo1.utils.EnumExamesMedicos;
import br.com.proway.senior.godevcadastrogrupo1.utils.EnumExamesMedicos.TiposExames;
/**
 * Classe ColaboradorControllerTest.
 * 
 * Teste os m�todos da classe {@link ColaboradorControllerTest}.
 * 
 * @author Sprint 5
 * @author Sarah Neuburger Brito <b>sarah.brito@senior.com.br</b>
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ColaboradorControllerTest {
	static Session session = DBConnection.getSession();
	static ColaboradorDAO dao = ColaboradorDAO.getInstance(session);
	static ContaDAO daoConta = ContaDAO.getInstance(session);
	static ContatosDAO daoContatos = ContatosDAO.getInstance(session);
	static EnderecoDAO daoEndereco = EnderecoDAO.getInstance(session);
	static ExameMedicoDAO daoExameMedico = ExameMedicoDAO.getInstance(session);
	static DependenteDAO daoDependente = DependenteDAO.getInstance(session);
	static IdentidadeGenero ig = EnumDadosPessoais.IdentidadeGenero.TRANS;
	static LocalDate data = LocalDate.of(2002, 01, 28);
	static TiposExames te = EnumExamesMedicos.TiposExames.ADMISSIONAL;
	static TiposDependentes tipoDep = EnumDadosPessoais.TiposDependentes.CONJUGE;

	@Test
	public void testCriarColaborador() {
		Colaborador c = ColaboradorController.criarColaborador("Brian", "Santos", "Erika", data, "Brasileiro",
				"Blumenau", true, null, ig, "09619039610", "mg14388606", 8, null, false, false, data, false, null,
				"brian@gmail.com", null, null, null, null, "54126547", null, null, null, null, "4521452015",
				"5421452103", "brian.santos@empresa.com.br", "1542413655", te, null, true, "banco00", "055",
				"438614625", "154", "Mario", "Santos", "Erika", data, "Brasileiro", "Blumenau", true, null,
				ig, "09619039610", "mg14388606", tipoDep, true);
		assertNotNull(c);
	}

	@Test
	public void testDeleteColabordor() {
		Colaborador c = ColaboradorController.criarColaborador("Brian", "Santos", "Erika", data, "Brasileira",
				"Blumenau", true, null, ig, "09619039610", "mg14388606", 8, null, false, false, data, false, null,
				"brian@gmail.com", null, null, null, null, "54126547", null, null, null, null, "4521452015",
				"5421452103", "brian.santos@empresa.com.br", "1542413655", te, null, true, "banco00", "055",
				"438614625", "154", "Erika", "Santos", "Erika", data, "Brasileiro", "Blumenauense", true, null,
				ig, "09619039610", "mg14388606", tipoDep, true);
		ColaboradorController.deleteColabordor(dao.readById(c.getId()));
		assertNull(dao.readById(c.getId()));
	}

	@Test
	public void testAtualizarColaborador() {
		Colaborador c = ColaboradorController.criarColaborador("Brian", "Santos", "Nada consta", data, "Brasileira",
				"Blumenau", true, null, ig, "09619039610", "mg14388606", 8, null, false, false, data, false, null,
				"brian@gmail.com", null, null, null, null, "54126547", null, null, null, null, "4521452015",
				"5421452103", "brian.santos@empresa.com.br", "1542413655", te, null, true, "banco00", "055",
				"438614625", "154", "joãozinho", "Santos", "Erika", data, "Brasileira", "Blumenau", true, null,
				ig, "09619039610", "mg14388606", tipoDep, true);
		session.clear();
		Integer id = c.getId();
		ColaboradorController.atualizarColaborador(id, "Brian", "Santos", "Nada consta", data, "Brasileira", "Blumenau",
				true, null, ig, "09619039610", "mg14388606", 8, null, false, false, data, false, null,
				"brian@gmail.com", null, null, null, null, "54126547", null, null, null, null, "4521452015",
				"5421452103", "brian.santos@empresa.com.br", "1542413655", te, null, true, "banco00", "055",
				"438614625", "154", "Carlos", "Santos", "Erika", data, "Brasileira", "Blumenau", true, null,
				ig, "09619039610", "mg14388606", tipoDep, true);
		assertEquals("Brian", dao.readById(id).getNome());
	}

	@Test
	public void testBuscarColaboradorPorId() {
		Conta conta = new Conta(null, null, null, null);
		Endereco endereco = new Endereco(null, null, null, "54215365", null, null, null, null);
		Contatos contatos = new Contatos("4521456985", "4521456985", "Jenifer", "4521456985");
		ExameMedico exameMedico = new ExameMedico(null, null, false);
		Dependente dependente = new Dependente("Jenifer", "Fonseca", "Jenifer", data, "Brasileira",
				"Blumenau", true, null, null, endereco, "09619039610", null, tipoDep, true);
		Colaborador colaborador = new Colaborador("Lucas", "Nunes", "Nada consta", data, "Brasileira", "Blumenau", false,
				"Masculino", ig, endereco, "21164028324", "45124563", contatos, null, null, false, false, data, false,
				null, "lucas.nunes@gmail.com", "554555", conta, exameMedico, dependente);
		dao.create(colaborador);
		assertEquals(colaborador, ColaboradorController.buscarColaboradorPorId(colaborador.getId()));

	}

	@Test
	public void testBuscarTodosColaborador() {
		Integer valorAntes = ColaboradorController.buscarTodosColaboradores().size();
		ColaboradorController.criarColaborador("Brian", "Santos", "Erika", data, "Brasileira", "Blumenau", true,
				null, ig, "09619039610", "mg14388606", 8, null, false, false, data, false, null, "brian@gmail.com",
				null, null, null, null, "54126547", null, null, null, null, "4521452015", "5421452103",
				"brian.santos@empresa.com.br", "1542413655", te, null, true, "banco00", "055", "438614625", "14",
				"joãozinho", "Santos", "Erika", data, "Brasileiro", "Blumenauense", true, null, ig, "09619039610",
				"mg14388606", tipoDep, true);
		assertEquals(valorAntes + 1, ColaboradorController.buscarTodosColaboradores().size());
	}

	@Test
	public void testAdicionarNovoDependente() {
		Colaborador colaborador = ColaboradorController.criarColaborador("Camila", "Souza", "Nada consta", data,
				"Brasileira", "Blumenau", true, null, ig, "09619039610", "mg14388606", 8, null, false, false, data,
				false, null, "brian@gmail.com", null, null, null, null, "54126547", null, null, null, null,
				"4521452015", "5421452103", "brian.santos@empresa.com.br", "1542413655", te, null, true, "banco00",
				"055", "438614625", "154", "joãozinho", "Santos", "Erika", data, "Brasileira", "Blumenau", true,
				null, ig, "09619039610", "mg14388606", tipoDep, true);
		ColaboradorController.adicionarDependente(colaborador, "David", "Hilderbrant", "Nada Consta", null, "Brasileira",
				"Blumenau", true, null, null, "123.587.893-50", "Mg-14.388.606",
				EnumDadosPessoais.TiposDependentes.PAI, false, "Rua sem saida", 666, "segue reto toda vida", null,
				"Garcia", "O sul é meu país", "Brusque", "SC");
		assertEquals(2, colaborador.getDependente().size());
	}

	@Test
	public void testAdicionarNovoExameMedico() {
		Colaborador colaborador = ColaboradorController.criarColaborador("Camila", "Souza", "Nada consta", data,
				"Venezuelano", "Blumenauense", true, null, ig, "09619039610", "mg14388606", 8, null, false, false, data,
				false, null, "brian@gmail.com", null, null, null, null, "54126547", null, null, null, null,
				"4521452015", "5421452103", "brian.santos@empresa.com.br", "1542413655", te, null, true, "banco00",
				"055", "438614625", "154", "joãozinho", "Santos", "Erika", data, "Brasileira", "Blumenau", true,
				null, ig, "09619039610", "mg14388606", tipoDep, true);
		TiposExames te2 = EnumExamesMedicos.TiposExames.PERIODICO;
		ColaboradorController.adicionarExameMedico(colaborador, te2, data, true);
		assertEquals(2, colaborador.getExameMedico().size());

	}

	@Test
	public void testBuscarPorNome() {
		Colaborador colaborador1 = ColaboradorController.criarColaborador("Joana", "Marla", "Nada consta", data,
				"Venezuelano", "Blumenauense", true, "Feminino", ig, "09619039610", "mg14388606", 8, 8788881, false, false, data,
				false, "88080888708", "joana@gmail.com", "04040505050", "Rua 1", 9, "Casa", "54126547", "Centro", "Brasil", "Blumenau", "SC",
				"4521452015", "5421452103", "joana@empresa.com.br", "1542413655", te, null, true, "banco00",
				"055", "438614625", "154", "Carlos", "Santos", "Erika", data, "Venezuelano", "Blumenauense", true,
				"Feminino", ig, "09619039610", "mg14388606", tipoDep, true);
		Colaborador colaborador2 = ColaboradorController.criarColaborador("Joana", "Pereira", "Nada consta", data,
				"Venezuelano", "Blumenauense", true, "Feminino", ig, "7878888878", "mg14388606", 8, 8788881, false, false, data,
				false, "88080888708", "joana@gmail.com", "04040505050", "Rua 1", 9, "Casa", "54126547", "Centro", "Brasil", "Blumenau", "SC",
				"4521452015", "5421452103", "joana@empresa.com.br", "1542413655", te, null, true, "banco00",
				"055", "438614625", "154", "Carlos", "Santos", "Erika", data, "Brasileiro", "Blumenau", true,
				"Feminino", ig, "09619039610", "mg14388606", tipoDep, true);
		
		ArrayList<Colaborador> listaRetorno = (ArrayList<Colaborador>) ColaboradorController.buscarColaboradorPorNome("Joana");
		assertEquals(2, listaRetorno.size());
		
	}
	
	@Before
	public void limparTabelas() {
		dao.deleteAll();
		daoConta.deleteAll();
		daoContatos.deleteAll();
		daoEndereco.deleteAll();
		daoExameMedico.deleteAll();
		daoExameMedico.deleteAll();
		daoDependente.deleteAll();
	}

}
