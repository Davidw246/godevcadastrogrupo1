package br.com.proway.senior.godevcadastrogrupo1.controller.DTO;

import java.util.ArrayList;
import java.util.List;

import br.com.proway.senior.godevcadastrogrupo1.controller.ColaboradorController;
import br.com.proway.senior.godevcadastrogrupo1.controller.EmpresaController;
import br.com.proway.senior.godevcadastrogrupo1.model.Colaborador;
import br.com.proway.senior.godevcadastrogrupo1.model.Empresa;
import br.com.proway.senior.godevcadastrogrupo1.model.DTO.ColaboradorCompletoDTO;
import br.com.proway.senior.godevcadastrogrupo1.model.DTO.EmpresaDTO;

/**
 * Classe ColaboradorCompletoControllerAPI
 * 
 * Classe disponibilizada para consulta dos dados da empresa via API Rest.
 * Implementa os m�todos de visualiza��o do {@link ColaboradorCompletoController} e atriutos
 * do model {@link ColaboradorCompletoDTO}.
 * 
 * @author Sarah Neuburger Brito <b>sarah.brito@senior.com.br</b>
 */
public class ColaboradorCompletoControllerAPI {
	
	static ColaboradorController controllerOriginal = new ColaboradorController();

	/**
	 * Buscar colaborador por Id.
	 * 
	 * M�todo busca as informa��es cadastradas do colaborador, conforme idColaborador
	 * informado. Retorna um objeto ColaboradorCompletoDTO que ser� visualizado pelo 
	 * cliente da API.
	 * 
	 * @param idColaborador identifica��o do colaborador que ser� retornado.
	 * @return ColaboradorCompletoDTO objeto com as informa��es do banco.
	 */
	public ColaboradorCompletoDTO buscarColaboradorPorId(Integer idColaborador) {
		ColaboradorCompletoDTO colaboradorDTO = new ColaboradorCompletoDTO(controllerOriginal.buscarColaboradorPorId(idColaborador));
		return colaboradorDTO;
	}

	/**
	 * Buscar todos os colaboradores.
	 * 
	 * M�todo busca as informa��es de todos os colaboradores cadastrados no banco de
	 * dados. Retorna uma lista de todos os registros de colaboradores.
	 * 
	 * @return listaColaboradorDTO lista de registros localizados.
	 */
	public static List<ColaboradorCompletoDTO> buscarTodosColaboradores() {
		List<ColaboradorCompletoDTO> listaColaboradorDTO = new ArrayList<ColaboradorCompletoDTO>();
		List<Colaborador> listaImprime = controllerOriginal.buscarTodosColaboradores();
		for (Colaborador colaborador : listaImprime) {
			listaColaboradorDTO.add(new ColaboradorCompletoDTO(colaborador));
		}
		return listaColaboradorDTO;
	}

	/**
	 * Busca empresa por nome.
	 * 
	 * M�todo busca as empresas no banco de dados atrav�s dos seus respectivos
	 * nomes, � poss�vel passar um par�metro parcial para retorna todos os registros
	 * que contenham determinado texto em seu nomeEmpresa.
	 * 
	 * @param nomeEmpresa nome dos registros que est�o sendo procurados.
	 * @return ArrayList Empresa lista de registros localizados.
	 */
	public static List<EmpresaDTO> buscarEmpresaPorNome(String nomeEmpresa) {
		List<EmpresaDTO> listaEmpresaDTO = new ArrayList<EmpresaDTO>();
		for (Empresa empresa : controllerOriginal.buscarEmpresaPorNome(nomeEmpresa)) {
			listaEmpresaDTO.add(new EmpresaDTO(empresa));
		}
		return listaEmpresaDTO;
	}

}
