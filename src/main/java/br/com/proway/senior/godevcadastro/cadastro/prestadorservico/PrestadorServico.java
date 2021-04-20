package br.com.proway.senior.godevcadastro.cadastro.prestadorservico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.ExameMedico;
import br.com.proway.senior.godevcadastro.cadastro.pessoa.Pessoa;

/**
 * Classe que abstrai as informa��es do prestador de servi�o contratado.
 * 
 * Possui inst�ncia de Contatos.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gon�alves.
 */

public class PrestadorServico extends Pessoa {

	private Integer idPrestadorServico;
	private LocalDate dataInicioContrato;
	private Integer idEmpresa;
	private Integer idSetor;
	private Contatos contatos;

	public PrestadorServico(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd,
			Integer idPrestadorServico, LocalDate dataInicioContrato, Integer idEmpresa, Integer idSetor,
			Contatos contatos) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
		this.idPrestadorServico = idPrestadorServico;
		this.dataInicioContrato = dataInicioContrato;
		this.idEmpresa = idEmpresa;
		this.idSetor = idSetor;
		this.contatos = contatos;
	}

	/**
	 * Construtor secund�rio da classe.
	 * 
	 * N�o inclui os atributos de pessoa com deficiencia e nome social.
	 */
	public PrestadorServico(String nome, String sobrenome, LocalDate dataDeNascimento, String genero, SexoPessoa sexo,
			String nomeDaMae, String cpf, Nacionalidades nacionalidade, Integer idPrestadorServico,
			LocalDate dataInicioContrato, Integer idEmpresa, Integer idSetor, Contatos contatos) {
		super(nome, sobrenome, dataDeNascimento, genero, sexo, nomeDaMae, cpf, nacionalidade);
		this.idPrestadorServico = idPrestadorServico;
		this.dataInicioContrato = dataInicioContrato;
		this.idEmpresa = idEmpresa;
		this.idSetor = idSetor;
		this.contatos = contatos;
	}

	public long getIdPrestadorServico() {
		return idPrestadorServico;
	}

	public void setIdPrestadorServico(Integer idPrestadorServico) {
		this.idPrestadorServico = idPrestadorServico;
	}

	public LocalDate getDataInicioContrato() {
		return dataInicioContrato;
	}

	public void setDataInicioContrato(LocalDate dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}

	public long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public long getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(Integer idSetor) {
		this.idSetor = idSetor;
	}

	public Contatos getContatos() {
		return this.contatos;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}

	/**
	 * Cadastrar prestador de servi�o
	 * 
	 * Realiza cadastro de um prestador de servi�o
	 * 
	 * @param ArrayList<PrestadorServico> listaPrestadorServico
	 * @param PrestadorServico            prestador
	 * @return void
	 */
	public static void cadastrarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico,
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
	public static ArrayList<PrestadorServico> listarTodosPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico) {
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
	public static ArrayList<PrestadorServico> listarPrestadorCodigo(ArrayList<PrestadorServico> listaPrestadorServico,
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
	public static void atualizarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico,
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
	public static void deletarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico, PrestadorServico prestador) {
		listaPrestadorServico.remove(prestador);
	}

	@Override
	public String toString() {
		return "PrestadorServico [idPrestadorServico=" + idPrestadorServico + ", dataInicioContrato="
				+ dataInicioContrato + ", idEmpresa=" + idEmpresa + ", idSetor=" + idSetor + ", contatos=" + contatos
				+ "]";
	}

}
