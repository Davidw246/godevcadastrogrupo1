package model;

import java.util.ArrayList;
	
	/**
	 * Armazena os contatos necess�rios de um colaborador, empresa ou prestador de
	 * servi�o.
	 * 
	 * � instanciada nas classes Colaborador, Empresa, e PrestadorServico.
	 * 
	 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago Luiz Barbieri e Vitor Nathan Gon�alves.
	 */

public class Contatos{

	private String telefonePrincipal;
	private String telefoneSecundario;
	private String email;

	public Contatos(String telefonePrincipal, String telefoneSecundario, String email) {
		setTelefonePrincipal(telefonePrincipal);
		setTelefoneSecundario(telefoneSecundario);
		setEmail(email);
	}

	/**
	 * Construtor secund�rio da classe
	 * 
	 * N�O inclui o telefone secund�rio.
	 * 
	 * @param telefonePrincipal
	 * @param email
	 */
	public Contatos(String telefonePrincipal, String email) {
		setTelefonePrincipal(telefonePrincipal);
		setEmail(email);
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
		return "Contatos telefonePrincipal=" + telefonePrincipal + ", telefoneSecundario=" + telefoneSecundario
				+ ", email=" + email;
	}

}
