package model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import br.com.proway.senior.godevcadastrogrupo1.utils.FormatacaoDocumentos;
import br.com.proway.senior.godevcadastrogrupo1.utils.ValidacaoDeDatas;
import br.com.proway.senior.godevcadastrogrupo1.utils.ValidacaoDocumentos;
import enums.EMDadosPessoais.IdentidadeGenero;

/**
 * Classe pessoa, abstrai os atributos de uma pessoa.
 * 
 * � instanciada em Colaborador, PrestadorServico e Dependente.
 * 
 * Deve ser instanciada utilizando o PessoaBuilder.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger
 *         Brito, Thiago Luiz Barbieri e Vitor Nathan Gon�alves.
 *         
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 */

@MappedSuperclass
public class Pessoa{

	private String nome;
	private String sobrenome;
	private String nomeSocial;
	private LocalDate dataDeNascimento;
	private String nacionalidade;
	private String naturalidade;
	private boolean pcd = false;
	private String genero;
	private IdentidadeGenero identidadeGenero;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	private String cpf;
	private String rg;
	
	public Pessoa() {
		
	}
	/**
	 * @param id
	 * @param nome
	 * @param sobrenome
	 * @param nomeSocial
	 * @param dataDeNascimento
	 * @param nacionalidade
	 * @param naturalidade
	 * @param pcd
	 * @param genero
	 * @param identidadeGenero
	 * @param endereco
	 * @param cpf
	 * @param rg
	 * @param contatos
	 */
	public Pessoa(String nome, String sobrenome, String nomeSocial, 
			LocalDate dataDeNascimento, String nacionalidade, String naturalidade,
			boolean pcd, String genero, IdentidadeGenero identidadeGenero,
			Endereco endereco, String cpf, String rg) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setNomeSocial(nomeSocial);
		this.setDataDeNascimento(dataDeNascimento);;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.pcd = pcd;
		this.genero = genero;
		this.identidadeGenero = identidadeGenero;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		try{
			FormatacaoDocumentos.removerCaracteres(nome);
			this.nome = nome;
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		try{
			FormatacaoDocumentos.removerCaracteres(sobrenome);
			this.sobrenome = sobrenome;
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	public String getNomeSocial() {
		return nomeSocial;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = FormatacaoDocumentos.removerCaracteres(nomeSocial);;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		try {
			if(ValidacaoDeDatas.validaDataDeNascimento(dataDeNascimento)) {
				this.dataDeNascimento = dataDeNascimento;
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String getNaturalidade() {
		return naturalidade;
	}
	
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	public boolean isPcd() {
		return pcd;
	}
	
	public void setPcd(boolean pcd) {
		this.pcd = pcd;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public IdentidadeGenero getIdentidadeGenero() {
		return identidadeGenero;
	}
	
	public void setIdentidadeGenero(IdentidadeGenero identidadeGenero) {
		this.identidadeGenero = identidadeGenero;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		try{
			if(ValidacaoDocumentos.validarCPF(cpf)) {
				this.cpf = cpf;
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}

}