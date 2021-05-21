package br.com.proway.senior.godevcadastrogrupo1.controller.DTO;

import java.util.ArrayList;
import java.util.List;

import br.com.proway.senior.godevcadastrogrupo1.controller.EmpresaController;
import br.com.proway.senior.godevcadastrogrupo1.controller.PrestadorServicoController;
import br.com.proway.senior.godevcadastrogrupo1.model.Empresa;
import br.com.proway.senior.godevcadastrogrupo1.model.PrestadorServico;
import br.com.proway.senior.godevcadastrogrupo1.model.DTO.EmpresaDTO;
import br.com.proway.senior.godevcadastrogrupo1.model.DTO.PrestadorServicoDTO;

/**
 * Classe EmpresaControllerAPI
 * 
 * Classe disponibilizada para consulta dos dados da empresa via API Rest.
 * Implementa os m�todos de visualiza��o do {@link EmpresaController} e atriutos
 * do model {@link EmpresaDTO}.
 * 
 * @author Sarah Neuburger Brito <b>sarah.brito@senior.com.br</b>
 */
public class EmpresaControllerAPI {

	static EmpresaController controllerOriginal = new EmpresaController();

	/**
	 * Buscar empresa por Id.
	 * 
	 * M�todo busca as informa��es cadastradas da empresa, conforme idEmpresa
	 * informado. Retorna um objeto EmpresaDTO que ser� visualizado pelo cliente da
	 * API.
	 * 
	 * @param idEmpresa identifica��o da empresa que ser� retornada.
	 * @return EmpresaDTO objeto com as informa��es do banco.
	 */
	public EmpresaDTO buscarEmpresaPorId(Integer idEmpresa) {
		EmpresaDTO empresaDTO = new EmpresaDTO(controllerOriginal.buscarEmpresaPorId(idEmpresa));
		return empresaDTO;
	}

	/**
	 * Buscar todas as empresas.
	 * 
	 * M�todo busca as informa��es de todas as empresas cadastradas no banco de dados.
	 * Retorna uma lista de todos os registros de empresas.
	 * 
	 * @return listaEmpresaDTO lista de registros localizados.
	 */
	public static List<EmpresaDTO> buscarTodasEmpresas() {
		List<EmpresaDTO> listaEmpresaDTO = new ArrayList<EmpresaDTO>();
		List<Empresa> listaImprime = controllerOriginal.buscarTodasEmpresas();
		for(Empresa empresa : controllerOriginal.buscarTodasEmpresas()) {
			listaEmpresaDTO.add(new EmpresaDTO(empresa));
		}
		return listaEmpresaDTO;
	}
	
	public static List<EmpresaDTO> buscarPrestadorServicoPorNome(String nomeEmpresa){
		List<EmpresaDTO> listaEmpresaDTO = new ArrayList<EmpresaDTO>();
		for(PrestadorServico empresa : controllerOriginal.bu(nomeEmpresa)) {
			listaEmpresaDTO.add(new EmpresaDTO(empresa));
		}
		return listaEmpresaDTO;
	}
	
}
