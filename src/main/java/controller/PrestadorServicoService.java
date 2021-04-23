package controller;

import java.util.ArrayList;

import model.PrestadorServico;

public class PrestadorServicoService {


	/**
	 * Cadastrar prestador de servi�o
	 * 
	 * Realiza cadastro de um prestador de servi�o
	 * 
	 * @param ArrayList<PrestadorServico> listaPrestadorServico
	 * @param PrestadorServico            prestador
	 * @return void
	 */
	public void cadastrarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestador) {
		listaPrestadorServico.add(prestador);
	}

	/**
	 * Listar todos os prestadores de servi�os
	 * 
	 * Realiza a leitura dos prestadores de servi�os cadastrados e apresenta na
	 * tela.
	 * 
	 * @param PrestadorServico prestador
	 * @param ArrayList        listaPrestadorServico
	 * @return ArrayList
	 */
	public ArrayList<PrestadorServico> listarTodosPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico) {
		for (PrestadorServico prestador2 : listaPrestadorServico) {
			System.out.println(prestador2);
		}
		return listaPrestadorServico;
	}

	/**
	 * Listar o prestador de servi�o conforme par�metro
	 * 
	 * Realiza a leitura do prestador de servi�o informado via par�metro e apresenta
	 * na tela.
	 * 
	 * @param PrestadorServico prestador
	 * @param ArrayList        listaPrestadorServico
	 * @return ArrayList
	 */
	public ArrayList<PrestadorServico> listarPrestadorCodigo(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestador) {
		for (PrestadorServico prestador2 : listaPrestadorServico) {
			if (listaPrestadorServico.contains(prestador)) {
				System.out.println(prestador2);
			}
		}
		return listaPrestadorServico;
	}

	/**
	 * Atualizar prestador de servi�os
	 * 
	 * Realiza a atualiza��o dos dados do prestador de servi�os atrav�s dos dados
	 * informados (prestadorNovo)
	 * 
	 * @param listaPrestadorServico
	 * @param prestadorAntigo
	 * @param prestadorNovo
	 * @return void
	 */
	public void atualizarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestadorAntigo, PrestadorServico prestadorNovo) {
		listaPrestadorServico.set(listaPrestadorServico.indexOf(prestadorAntigo), prestadorNovo);
	}

	/**
	 * Deletar prestador de servi�o
	 * 
	 * Realiza a exclus�o do prestador de servi�o conforme par�metro passado
	 * (PrestadorServico prestador).
	 * 
	 * @param ArrayList<PrestadorServico> listaPrestadorServico
	 * @param PrestadorServico            prestador
	 * @return void
	 */
	public void deletarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico, PrestadorServico prestador) {
		listaPrestadorServico.remove(prestador);
	}
	
}
