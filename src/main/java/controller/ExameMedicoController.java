
package controller;

import java.util.ArrayList;

import model.ExameMedico;

public class ExameMedicoController {


	/**
	 * Cadastrar exame m�dico
	 * 
	 * Realiza cadastro de um exame m�dico
	 * 
	 * @param ArrayList<ExameMedico> listaExames
	 * @param ExameMedico            exame
	 * @return void
	 */
	public void cadastrarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		listaExames.add(exame);
		for (ExameMedico exame2 : listaExames) {
			System.out.println(exame2);
		}
	}

	/**
	 * Listar todos os exames m�dicos
	 * 
	 * Realiza a leitura de todos os exames m�dicos cadastrados e apresenta na tela.
	 * 
	 * @param ExameMedico exame
	 * @param ArrayList   listaExames
	 * @return ArrayList
	 */
	public ArrayList<ExameMedico> listarTodosExames(ArrayList<ExameMedico> listaExames) {
		for (ExameMedico exame2 : listaExames) {
			System.out.println(exame2);
		}
		return listaExames;
	}

	/**
	 * Listar o exame m�dico conforme par�metro
	 * 
	 * Realiza a leitura do exame m�dico informado via par�metro e apresenta na
	 * tela.
	 * 
	 * @param ExameMedico exame
	 * @param ArrayList   listaExame
	 * @return ArrayList
	 */
	public ArrayList<ExameMedico> listarExameCodigo(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		for (ExameMedico exame2 : listaExames) {
			if (listaExames.contains(exame)) {
				System.out.println(exame2);
			}
		}
		return listaExames;
	}

	/**
	 * Atualizar exame m�dico
	 * 
	 * Realiza a atualiza��o dos dados do exame m�dico atrav�s dos dados informados
	 * (exameNovo)
	 * 
	 * @param listaExames
	 * @param exameAntigo
	 * @param exameNovo
	 * @return void
	 */
	public void atualizarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exameAntigo,
			ExameMedico exameNovo) {
		listaExames.set(listaExames.indexOf(exameAntigo), exameNovo);
	}

	/**
	 * Deletar exame m�dico
	 * 
	 * Realiza a exclus�o do exame m�dico conforme par�metro passado (ExameMedico
	 * exame).
	 * 
	 * @param ArrayList<ExameMedico> listaExames
	 * @param ExameMedico            exame
	 * @return void
	 */
	public void deletarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		listaExames.remove(exame);
	}

	
}
