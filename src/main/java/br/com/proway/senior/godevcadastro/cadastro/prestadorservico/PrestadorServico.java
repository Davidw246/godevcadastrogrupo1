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
 * s
 * @author Vitor Nathan Gon�alves
 *
 */
public class PrestadorServico extends Pessoa {

	/**
	 * ID do prestador de servi�o
	 */
	private Integer idPrestadorServico;
	
	/**
	 * Data de in�cio da validade do contrato com o prestador de servi�o
	 */
	private LocalDate dataInicioContrato;
	
	/**
	 * ID da empresa na qual o prestador de servi�o trabalha
	 */
	private Integer idEmpresa;
	
	/**
	 * ID do setor no qual o prestador de servi�o trabalha
	 */
	private Integer idSetor;
	
	/**
	 * Armazena as informa��es de contato do prestador de servi�o
	 */
	private Contatos contatos;
	
	
	/**
	 * Construtor completo da classe.
	 * 
	 * Inclui os atributos de pessoa com defici�ncia e nome social
	 * @param nome
	 * @param sobrenome
	 * @param dataDeNascimento
	 * @param nomeSocial
	 * @param genero
	 * @param sexo
	 * @param nomeDaMae
	 * @param cpf
	 * @param nacionalidade
	 * @param pcd
	 * @param idPrestadorServico
	 * @param dataInicioContrato
	 * @param idEmpresa
	 * @param idSetor
	 * @param contatos
	 */
	public PrestadorServico(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd, Integer idPrestadorServico,
			LocalDate dataInicioContrato, Integer idEmpresa, Integer idSetor, Contatos contatos) {
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
	 * @param nome
	 * @param sobrenome
	 * @param dataDeNascimento
	 * @param genero
	 * @param sexo
	 * @param nomeDaMae
	 * @param cpf
	 * @param nacionalidade
	 * @param idPrestadorServico
	 * @param dataInicioContrato
	 * @param idEmpresa
	 * @param idSetor
	 * @param contatos
	 */
	public PrestadorServico(String nome, String sobrenome, LocalDate dataDeNascimento, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, Integer idPrestadorServico,
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
	 * @param ArrayList<PrestadorServico> prestadores
	 * @param PrestadorServico prestador
	 * @return void
	 */
	public static void cadastrarPrestadorServico(ArrayList<PrestadorServico> prestadores, PrestadorServico prestador) {
		prestadores.add(prestador);
		for (PrestadorServico prestador2 : prestadores) {
		System.out.println(prestador2);
		}
	}
	
	/**
	 * Listar todos os prestadores de servi�os
	 * 
	 * Realiza a leitura dos prestadores de servi�os cadastrados
	 * e apresenta na tela.
	 * 
	 * @param PrestadorServico prestador
	 * @param ArrayList prestadores
	 * @return ArrayList prestadores
	 */
	public static ArrayList<PrestadorServico> listarTodosPrestadores(ArrayList<PrestadorServico> prestadores) {
		for (PrestadorServico prestador2 : prestadores) {
			System.out.println(prestador2);			
		}
		return prestadores;
	}
	
	/**
	 * Listar o prestador de servi�o conforme par�metro
	 * 
	 * Realiza a leitura do prestador de servi�o informado via par�metro
	 * e apresenta na tela.
	 * 
	 * @param PrestadorServico prestador
	 * @param ArrayList prestadores
	 * @return ArrayList prestadores
	 */
	public static ArrayList<PrestadorServico> listarPrestadorCodigo(ArrayList<PrestadorServico> prestadores, PrestadorServico prestador) {
		for (PrestadorServico prestador2 : prestadores) {
			if (prestadores.contains(prestador)) {
			System.out.println(prestador2);		
			}
		}	
		return prestadores;
	}
	
	
	/**
	 * Atualizar prestador de servi�os
	 * 
	 * Realiza a atualiza��o dos dados do prestador de servi�os
	 * atrav�s dos dados informados (prestadorNovo)
	 * 
	 * @param prestadores
	 * @param prestadorAntigo
	 * @param prestadorNovo
	 * @return void
	 */
	public static void atualizarExameMedico(ArrayList<PrestadorServico> prestadores, ExameMedico exameAntigo, ExameMedico exameNovo) {
		prestadores.set(prestadores.indexOf(exameAntigo), exameNovo);
	}
	
	
	@Override
	public String toString() {
		return "PrestadorServico [idPrestadorServico=" + idPrestadorServico + ", dataInicioContrato="
				+ dataInicioContrato + ", idEmpresa=" + idEmpresa + ", idSetor=" + idSetor + ", contatos=" + contatos
				+ "]";
	}
	
}
