package br.com.proway.senior.godevcadastro.cadastro.examemedico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import br.com.proway.senior.godevcadastro.cadastro.colaborador.Colaborador;

public class ExameMedico {

	/**
	 * Classe ExameMedico
	 * 
	 * Classe recebe informa��es para cadastro dos exames m�dicos que ser�
	 * instanciada na classe Colaborador para o cadastramento do mesmo
	 */

	/**
	 * @param TiposExame tipoExame
	 * @param private    Date dataExame
	 * @param private    boolean apto
	 */
	TiposExame tipoExame;
	private LocalDate dataExame;
	private boolean apto;

	/**
	 * Selecionar o tipo de exame.
	 * 
	 * O m�todo realiza o check do tipo do exame a partir do seu ID (de 0 � 2) para
	 * retornar o nome do referido exame.
	 * 
	 * @param int tipo Valor n�merico que representa o exame.
	 * @return resultado
	 */
	public String selecionarTipoExame(int tipo) {
		String resultadoExame = null;
		switch (tipo) {
		case 0:
			resultadoExame = tipoExame.EXAME_ADMISSIONAL.toString();
			break;
		case 1:
			resultadoExame = tipoExame.EXAME_PERIODICO.toString();
			break;
		case 2:
			resultadoExame = tipoExame.EXAME_DEMISSIONAL.toString();
			break;
		default:
			System.out.println("Insira uma op��o v�lida.");
		}

		return resultadoExame;
	}

	public TiposExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TiposExame tipoExame) {
		this.tipoExame = tipoExame;
	}

	public LocalDate getDataExame() {
		return dataExame;
	}

	public void setDataExame(LocalDate dataExame) {
		this.dataExame = dataExame;
	}

	public boolean isApto() {
		return apto;
	}

	public void setApto(boolean apto) {
		this.apto = apto;
	}

	public ExameMedico() {

	}

	/**
	 * Construtor para o cadastro do exame. Recebe os dados referente ao tipo do
	 * exame, a data de realiza��o e o resultado.
	 * 
	 * @param tipoExame Tipo do exame conoforme par�metros: EXAME_ADMISSIONAL (0),
	 *                  EXAME_PERIODICO (1), EXAME_DEMISSIONAL (2).
	 * @param LocalDate dataExame Data d realiza��o do exame.
	 * @param boolean   apto Para a defini��o se apto (true) ou inapto (falso).
	 */
	public ExameMedico(TiposExame tipoExame, LocalDate dataExame, boolean apto) {
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
		this.apto = apto;
	}

	/** 
	 * Cadastrar exame m�dico
	 * 
	 * Realiza cadastro de um exame m�dico
	 * 
	 * @param ArrayList<ExameMedico> exames
	 * @param ExameMedico exame
	 * @return void
	 */
	public static void cadastrarExameMedico(ArrayList<ExameMedico> exames, ExameMedico exame) {
		exames.add(exame);
		for (ExameMedico exame2 : exames) {
		System.out.println(exame2);
		}
	}
	
	/**
	 * Listar todos os exames m�dicos
	 * 
	 * Realiza a leitura de todos os exames m�dicos cadastrados
	 * e apresenta na tela.
	 * 
	 * @param ExameMedico exame
	 * @param ArrayList exames
	 * @return ArrayList exames
	 */
	public static ArrayList<ExameMedico> listarTodosExames(ArrayList<ExameMedico> exames) {
		for (ExameMedico exame2 : exames) {
			System.out.println(exame2);			
		}
		return exames;
	}
	
	/**
	 * Listar o exame m�dico conforme par�metro
	 * 
	 * Realiza a leitura do exame m�dico informado via par�metro
	 * e apresenta na tela.
	 * 
	 * @param ExameMedico exame
	 * @param ArrayList exames
	 * @return ArrayList exames
	 */
	public static ArrayList<ExameMedico> listarExameCodigo(ArrayList<ExameMedico> exames, ExameMedico exame) {
		for (ExameMedico exame2 : exames) {
			if (exames.contains(exame)) {
			System.out.println(exame2);		
			}
		}	
		return exames;
	}
	
	/**
	 * Atualizar exame m�dico
	 * 
	 * Realiza a atualiza��o dos dados do exame m�dico
	 * atrav�s dos dados informados (exameNovo)
	 * 
	 * @param exames
	 * @param exameAntigo
	 * @param exameNovo
	 * @return void
	 */
	public static void atualizarExameMedico(ArrayList<ExameMedico> exames, ExameMedico exameAntigo, ExameMedico exameNovo) {
		exames.set(exames.indexOf(exameAntigo), exameNovo);
	}
	
	/**
	 * Deletar exame m�dico
	 * 
	 * Realiza a exclus�o do exame m�dico conforme par�metro
	 * passado (ExameMedico exame).
	 * 
	 * @param ArrayList<ExameMedico> exames
	 * @param ExameMedico exame
	 * @return void
	 */
	public static void deletarExameMedico(ArrayList<ExameMedico> exames, ExameMedico exame) {
		exames.remove(exame);
	}
	
	@Override
	public String toString() {
		return "ExameMedico [tipoExame=" + tipoExame + ", dataExame=" + dataExame + ", apto=" + apto + ", escolha=]";
	}

}
