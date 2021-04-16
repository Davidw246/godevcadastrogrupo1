package br.com.proway.senior.godevcadastro.cadastro;

/**
 * Armazena os contatos necess�rios de um colaborador, empresa ou prestador de servi�o.
 * 
 * � instanciada nas classes Colaborador, Empresa, e PrestadorServico.
 * @author Vitor Nathan Gon�alves
 *
 */
public class Contatos {
	
	/**
	 * Telefone mais utilizado pela pessoa
	 */
	private String telefonePrincipal;
	
	/**
	 * Telefone menos utilizado/recado
	 */
	private String telefoneSecundario;
	
	/**
	 * Email principal da pessoa
	 */
	private String email;
	
	/**
	 * Construtor principal da classe.
	 * 
	 * Inclui o telefone secund�rio
	 * @param telefonePrincipal
	 * @param telefoneSecundario
	 * @param email
	 */
	public Contatos(String telefonePrincipal, String telefoneSecundario, String email) {
		this.telefonePrincipal = telefonePrincipal;
		this.telefoneSecundario = telefoneSecundario;
		this.email = email;
	}
	
	/**
	 * Construtor secund�rio da classe
	 * 
	 * N�O inclui o telefone secund�rio
	 * 
	 * @param telefonePrincipal
	 * @param email
	 */
	public Contatos(String telefonePrincipal, String email) {
		this.telefoneSecundario = null;
		this.telefonePrincipal = telefonePrincipal;
		this.email = email;
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}

	public String getTelefoneSecundario() {
		return telefoneSecundario;
	}

	public void setTelefoneSecundario(String telefoneSecundario) {
		this.telefoneSecundario = telefoneSecundario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contatos [telefonePrincipal=" + telefonePrincipal + ", telefoneSecundario=" + telefoneSecundario
				+ ", email=" + email + "]";
	}

}
