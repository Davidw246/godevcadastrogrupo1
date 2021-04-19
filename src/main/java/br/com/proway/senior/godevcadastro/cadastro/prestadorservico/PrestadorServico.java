package br.com.proway.senior.godevcadastro.cadastro.prestadorservico;

import java.time.LocalDate;
import java.util.Date;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;
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
	private long idPrestadorServico;
	
	/**
	 * Data de in�cio da validade do contrato com o prestador de servi�o
	 */
	private LocalDate dataInicioContrato;
	
	/**
	 * ID da empresa na qual o prestador de servi�o trabalha
	 */
	private long idEmpresa;
	
	/**
	 * ID do setor no qual o prestador de servi�o trabalha
	 */
	private long idSetor;
	
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
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd, long idPrestadorServico,
			LocalDate dataInicioContrato, long idEmpresa, long idSetor, Contatos contatos) {
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
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, long idPrestadorServico,
			LocalDate dataInicioContrato, long idEmpresa, long idSetor, Contatos contatos) {
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

	public void setIdPrestadorServico(long idPrestadorServico) {
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

	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public long getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(long idSetor) {
		this.idSetor = idSetor;
	}

	public Contatos getContatos() {
		return this.contatos;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}
}
