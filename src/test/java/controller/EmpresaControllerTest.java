package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import br.com.proway.senior.godevcadastrogrupo1.controller.EmpresaController;
import br.com.proway.senior.godevcadastrogrupo1.model.Contatos;
import br.com.proway.senior.godevcadastrogrupo1.model.Empresa;
import br.com.proway.senior.godevcadastrogrupo1.model.Endereco;
import br.com.proway.senior.godevcadastrogrupo1.model.DAO.EmpresaDAO;
import br.com.proway.senior.godevcadastrogrupo1.persistence.DBConnection;
/**
 * Classe EmpresaControllerTest.
 * 
 * Testa os m�todos da classe {@link EmpresaController}.
 * 
 * @author Sprint 5
 * @author Sarah Neuburger Brito <b>sarah.brito@senior.com.br</b> - Sprint 6
 *
 */
public class EmpresaControllerTest {

	static Session session = DBConnection.getSession();
	static EmpresaDAO dao = EmpresaDAO.getInstance(session);
	static Contatos contatos = new Contatos("478889996655", "47985556633", "empresa@gmail.com", "47987456321");
	static Endereco endereco = new Endereco("Rua Principal", 15, "Nada consta", "Centro", "89789456", "Brasil", "Blumenau", "SC");
	static Empresa empresa = new Empresa("Senior", LocalDate.now(), "12345678", null, null);

	@Test
	public void testCriarEmpresa() {
		Empresa empresaCriada = EmpresaController.criarEmpresa("Cooper", LocalDate.of(2019, 12, 31), "78456963000115", "4798888556633", 
				"47888997852", "atendimento@cooper.com", 
				"4788896655", "Rua XV", 78, "Pr�ximo �", "89036789", "Escola Agr�cola", "Brasil", "Blumenau", "SC");
		assertEquals("Cooper", empresaCriada.getNomeEmpresa());
		assertEquals("78456963000115", empresaCriada.getCnpj());
		assertEquals("Escola Agr�cola", empresaCriada.getEndereco().getBairro());
	}

	@Test
	public void testDeleteEmpresa() {
		Empresa empresaCriada = EmpresaController.criarEmpresa("Viacred", LocalDate.of(218, 12, 31), "78456963000115", "4798888556633", 
				"47888997852", "atendimento@cooper.com", 
				"4788896655", "Rua XV", 78, "Pr�ximo �", "89036789", "Centro", "Brasil", "Blumenau", "SC");
		EmpresaController.deleteEmpresa(empresaCriada);
		assertNull(EmpresaController.buscarEmpresaPorId(empresaCriada.getId()));
	}

	@Test
	public void testAtualizarEmpresa() {
		Empresa empresaCriada = EmpresaController.criarEmpresa("Caixa", LocalDate.of(2019, 12, 31), "78456963000115", "4798888556633", 
				"47888997852", "atendimento@caixa.com", 
				"4788896655", "Rua XV", 78, "Pr�ximo �", "89036789", "Escola Agr�cola", "Brasil", "Blumenau", "SC");
		Empresa empresaAlterada = EmpresaController.atualizarEmpresa(empresaCriada.getId(), "Caixa Econ�mica", LocalDate.of(2021, 03, 31), 
				"89456789000123", contatos, endereco);
		assertEquals(empresaCriada.getId(), empresaAlterada.getId());
		assertNotEquals("Caixa", empresaAlterada.getNomeEmpresa());
		assertEquals("Caixa Econ�mica", empresaAlterada.getNomeEmpresa());

	}

	@Test
	public void testBuscarEmpresaPorId() {
		Empresa empresaCriada = EmpresaController.criarEmpresa("Selecionar", LocalDate.of(2019, 12, 31), "78456963000115", "4798888556633", 
				"47888997852", "atendimento@selecionar.com", 
				"4788896655", "Rua XV", 78, "Pr�ximo �", "89036789", "Victor Konder", "Brasil", "Blumenau", "SC");
		session.clear();
		dao.create(empresa);
		assertEquals(empresa, EmpresaController.buscarEmpresaPorId(empresa.getId()));
	}

	@Test
	public void testBuscarTodasEmpresas() {
		Empresa empresaCriada = EmpresaController.criarEmpresa("Hering", LocalDate.of(2019, 12, 31), "45123987000123", "4798888556633", 
				"47888997852", "atendimento@hering.com.br", 
				"4788896655", "Rua XV", 78, "Pr�ximo �", "89036789", "Bom Retiro", "Brasil", "Blumenau", "SC");
		session.clear();
		dao.create(empresa);
		List<Empresa> empresa2 = EmpresaController.buscarTodasEmpresas();
		assertEquals("Senior", empresa2.get(empresa2.size() - 1).getNomeEmpresa());
	}

	@Before
	public void limparTabela() {
		dao.deleteAll();
	}
}
