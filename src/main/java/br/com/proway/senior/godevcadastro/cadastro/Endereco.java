package br.com.proway.senior.godevcadastro.cadastro;

/**
 * Classe que engloba e abstrai as informa��es de endereco de um Colaborador/Empresa
 * Esta classe ser� instanciada nas classes Colaborador e Empresa
 * 
 * @author Thiago Barbieri
 *
 */
public class Endereco {

	/**
	 * Atributos da classe
	 * 
	 * @param logradouro Ruas, avenidas, pra�as, viadutos.
	 * @param numero N�mero do endere�o.
	 * @param bairro Bairro do endere�o.
	 * @param cidade Cidade do endere�o.
	 * @param uf Estado do endere�o. Deve-sepreencher a sigla do Estado.
	 * @param complemento Complemento do endere�o (Ex: loja 1; Bloco A, Box. 100).
	 * @param cep  C�digo de Endere�amento Postal do endere�o.
	 * @param pais Pais do endere�o.
	 */
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String complemento;
	private String cep;
	private String pais;
	
	
	/**
	 * Construtor de Endere�o com todos os atributos
	 * 
	 * @param logradouro
	 * @param numero
	 * @param bairro
	 * @param cidade
	 * @param uf
	 * @param complemento
	 * @param cep
	 * @param pais
	 */
	public Endereco(String logradouro, int numero, String bairro, String cidade, String uf, String complemento,
			String cep, String pais) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.complemento = complemento;
		this.cep = cep;
		this.pais = pais;
	}
	
	/**
	 * Construtor de Endereco
	 * N�o inclui o complemento.
	 * 
	 * @param logradouro
	 * @param numero
	 * @param bairro
	 * @param cidade
	 * @param uf
	 * @param cep
	 * @param pais
	 */
	public Endereco(String logradouro, int numero, String bairro, String cidade, String uf, String cep, String pais) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.pais = pais;
	}

	public Endereco() {
		super();
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + ", complemento=" + complemento + ", cep=" + cep + ", pais=" + pais + "]";
	}

}
