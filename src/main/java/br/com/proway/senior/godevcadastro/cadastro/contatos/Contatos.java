package br.com.proway.senior.godevcadastro.cadastro.contatos;

import java.util.ArrayList;

/**
 * Armazena os contatos necess�rios de um colaborador, empresa ou prestador de
 * servi�o.
 * 
 * � instanciada nas classes Colaborador, Empresa, e PrestadorServico.
 * 
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
	 * 
	 * @param telefonePrincipal
	 * @param telefoneSecundario
	 * @param email
	 */
	public Contatos(String telefonePrincipal, String telefoneSecundario, String email) {
		setTelefonePrincipal(telefonePrincipal);
		setTelefoneSecundario(telefoneSecundario);
		setEmail(email);
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
		this.telefonePrincipal = telefonePrincipal;
		this.email = email;
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setTelefonePrincipal(String telefonePrincipal) {
		String telFormatado = formatarTelefone(telefonePrincipal);
		if(validarTamanhoTel(telefonePrincipal)) {
			this.telefonePrincipal = telFormatado;
		} else {
			System.out.println("Telefone inv�lido!");
		}
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

	/**
	 * Insere o email no objeto
	 * 
	 * Este m�todo faz a inser��o do email no objeto, desde que haja o caractere "@"
	 * na String
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("Email inv�lido!");
		}
	}
	
	public boolean validarTamanhoTel(String telefone) {
		if(telefone.length() != 11) {
			return false;
		}
		return true;
	}

	/**
	 * Cadastrar contato
	 * 
	 * Realiza cadastro de contato no ArrayList<Contatos>
	 * 
	 * @param contatos
	 * @param contato
	 */
	public static void cadastrarContato(ArrayList<Contatos> contatos, Contatos contato) {
		contatos.add(contato);
	}

	/**
	 * Formatar telefone
	 * 
	 * Realiza a valida��o do telefone para verificar se possui apenas numeros.
	 * 
	 * @param String telefone
	 * @return telefone Formatado
	 */
	public static String formatarTelefone(String telefone) {
		String telefoneFormatado = "";
		for (byte code : telefone.getBytes()) {
			if (code - 48 < 10 && code - 48 >= 0) {
				telefoneFormatado += Character.toString((char) code);
			}
		}
		return telefoneFormatado;
	}

	/**
	 * Validar email
	 * 
	 * Realiza valida��o do email para verificar se possui o caracter "@".
	 * 
	 * @param String email
	 * @return true caso valido
	 */
	public static boolean validarEmail(String email) {
		if (!email.contentEquals("@")) {
			return false;
		}
		return true;
	}

	/**
	 * Lista um contato
	 * 
	 * Este m�todo verifica se o id informado � menor ou igual ao tamanho total da
	 * lista, e se for menor ou igual, adiciona � lista de contatos
	 * 
	 * @param ArrayList<Contatos> contatos
	 * @param Integer             id
	 * @return contatos.get(id)
	 */
	public static Contatos listarContato(ArrayList<Contatos> contatos, Integer id) {
		if (id <= contatos.size() - 1) {
			contatos.get(id).getEmail();
			contatos.get(id).getTelefonePrincipal();
			contatos.get(id).getTelefoneSecundario();
			return contatos.get(id);
		}
		return null;
	}

	/**
	 * Atualiza os dados do contato
	 * 
	 * Este m�todo atualiza os dados de contato e faz uma verifica��o se o id
	 * informado � menor ou igual ao tamanho total da lista, e se for, ele ir�
	 * buscar o usu�rio a ser atualizado pelo id e trocar seus dados
	 * 
	 * @param ArrayList<Contatos> contatos
	 * @param Contatos            contato
	 * @param Integer             id
	 * @return Contatos contato
	 */
	public static Contatos atualizarUmContato(ArrayList<Contatos> contatos, Contatos contato, Integer id) {
		if (id <= contatos.size() - 1) {
			contatos.set(id, contato);
			return contato;
		}
		return null;
	}

	/**
	 * Remove um contato da lista
	 * 
	 * Este m�todo remove um contato da lista e faz uma verifica��o se o id
	 * informado � menor ou igual ao tamanho total da lista, e se for, ele ir�
	 * buscar o contato a ser removido por id e remover� da lista
	 * 
	 * @param ArrayList<Contatos> contatos
	 * @param Integer             id
	 * @return String "Contato foi removido com sucesso!"
	 */
	public static String removerUmContato(ArrayList<Contatos> contatos, Integer id) {
		if (id <= contatos.size() - 1) {
			contatos.remove(contatos.get(id));
			return "Contato foi removido com sucesso!";
		}
		return "Contato n�o foi encontrado!";
	}

	/**
	 * Remove um contato da lista
	 * 
	 * Este m�todo remove um contato da lista e faz uma verifica��o se o objeto contato
	 * informado estiver na lista, caso n�o esteja, retorna uma String de aviso.
	 * 
	 * @param ArrayList<Contatos> contatos
	 * @param Contatos contato
	 * @return String "Contato foi removido com sucesso!"
	 */
	public static String removerUmContatoPassandoUmContato(ArrayList<Contatos> contatos, Contatos contato) {
		try {
			contatos.remove(contato);
			return "Contato foi removido com sucesso!";
		} catch (Exception e) {
			return "Contato n�o foi encontrado!";
		}
	}

	@Override
	public String toString() {
		return "Contatos [telefonePrincipal=" + telefonePrincipal + ", telefoneSecundario=" + telefoneSecundario
				+ ", email=" + email + "]";
	}

}
