package model;

import java.time.LocalDate;

import controller.Model;
import enums.Nacionalidades;
import enums.SexoPessoa;

/**
 * Classe pessoa, abstrai os atributos de uma pessoa.
 * 
 * � herdada por Colaborador, PrestadorServico e Dependente.
 * 
 * @author @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger
 *         Brito, Thiago Luiz Barbieri e Vitor Nathan Gon�alves.
 *
 */

public class Pessoa implements Model{

	private String nome;
	private String sobrenome;
	private LocalDate dataDeNascimento;
	private String nomeSocial;
	private String genero;
	private SexoPessoa sexo;
	private String nomeDaMae;
	private String cpf;
	private Nacionalidades nacionalidade;
	private boolean pcd = false;

	public Pessoa(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
		this.pcd = pcd;
	}

	/**
	 * Construtor secund�rio da classe Pessoa.
	 * 
	 * N�O inclui os atributos pcd e nomeSocial.
	 */
	public Pessoa(String nome, String sobrenome, LocalDate dataDeNascimento, String genero, SexoPessoa sexo,
			String nomeDaMae, String cpf, Nacionalidades nacionalidade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.genero = genero;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
	}

	/**
	 * Construtor secund�rio da classe Pessoa.
	 * 
	 * N�O inclui os atributos pcd.
	 */
	public Pessoa(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public SexoPessoa getSexo() {
		return sexo;
	}

	public void setSexo(SexoPessoa sexo) {
		this.sexo = sexo;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Nacionalidades getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidades nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public boolean isPcd() {
		return pcd;
	}

	public void setPcd(boolean pcd) {
		this.pcd = pcd;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", dataDeNascimento=" + dataDeNascimento
				+ ", nomeSocial=" + nomeSocial + ", genero=" + genero + ", sexo=" + sexo + ", nomeDaMae=" + nomeDaMae
				+ ", cpf=" + cpf + ", nacionalidade=" + nacionalidade + ", pcd=" + pcd + "]";
	}

}
