package br.com.proway.senior.godevcadastro.cadastro.contatos;

import java.util.ArrayList;
	
	/**
	 * Armazena os contatos necess�rios de um colaborador, empresa ou prestador de
	 * servi�o.
	 * 
	 * � instanciada nas classes Colaborador, Empresa, e PrestadorServico.
	 * 
	 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago Luiz Barbieri e Vitor Nathan Gon�alves.
	 */

public class Contatos {

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

	/**
	 * Insere o telefone principal no Objeto Contatos
	 * 
	 * Este metodo faz a inser��o do telefone no objeto, desde que seja v�lido.
	 * 
	 * @param telefonePrincipal
	 */
	public void setTelefonePrincipal(String telefonePrincipal) {
		String telFormatado = formatarTelefone(telefonePrincipal);
		if(validarTamanhoTel(telFormatado)) {
			this.telefonePrincipal = telFormatado;
		} else {
			System.out.println("Telefone inv�lido!");
		}
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}
	
	/**
	 * Insere o telefone secund�rio no Objeto Contatos
	 * 
	 * Este metodo faz a inser��o do telefone no objeto, desde que seja v�lido.
	 * 
	 * @param telefoneSecundario
	 */
	public void setTelefoneSecundario(String telefoneSecundario) {
		String telFormatado = formatarTelefone(telefoneSecundario);
		if(validarTamanhoTel(telFormatado)) {
			this.telefoneSecundario = telFormatado;
		} else {
			System.out.println("Telefone inv�lido!");
		}
	}
	
	public String getTelefoneSecundario() {
		return telefoneSecundario;
	}

	/**
	 * Insere o email no objeto
	 * 
	 * Este m�todo faz a inser��o do email no objeto, desde que haja o caractere "@"
	 * na String.
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
	
	public String getEmail() {
		return email;
	}
	
	/**
	 * Valida o tamanho do telefone
	 * 
	 * Este m�todo verifica se h� 11 d�gitos no telefone. Se houver ele retorna true
	 * caso contr�rio, retorna false.
	 * 
	 * @param telefone
	 * @return boolean
	 */
	public static boolean validarTamanhoTel(String telefone) {
		if(telefone.length() != 11) {
			return false;
		}
		return true;
	}

	/**
	 * Formatar telefone
	 * 
	 * Realiza a valida��o do telefone para verificar se possui apenas n�meros.
	 * 
	 * @param String telefone
	 * @return String telefoneFormatado
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
	 * Cadastrar contato
	 * 
	 * Realiza cadastro de contato no ArrayList<Contatos>
	 * 
	 * @param listaContatos
	 * @param contato
	 */
	public static void cadastrarContato(ArrayList<Contatos> listaContatos, Contatos contato) {
		listaContatos.add(contato);
	}

	/**
	 * Validar email
	 * 
	 * Realiza valida��o do email para verificar se possui o caracter "@".
	 * 
	 * @param String email
	 * @return boolean
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
	 * lista, e se for menor ou igual, adiciona � lista de contatos.
	 * 
	 * @param ArrayList<Contatos> listaContatos
	 * @param Integer id
	 * @return contatos.get(id)
	 */
	public static Contatos listarContato(ArrayList<Contatos> listaContatos, Integer id) {
		if (id <= listaContatos.size() - 1) {
			listaContatos.get(id).getEmail();
			listaContatos.get(id).getTelefonePrincipal();
			listaContatos.get(id).getTelefoneSecundario();
			return listaContatos.get(id);
		}
		return null;
	}

	/**
	 * Atualiza os dados do contato
	 * 
	 * Este m�todo atualiza os dados de contato e faz uma verifica��o se o id
	 * informado � menor ou igual ao tamanho total da lista, e se for, ele ir�
	 * buscar o contato a ser atualizado pelo id e trocar seus dados.
	 * 
	 * @param ArrayList<Contatos> listaContatos
	 * @param Contatos contato
	 * @param Integer id
	 * @return Contatos contato
	 */
	public static Contatos atualizarContato(ArrayList<Contatos> listaContatos, Contatos contato, Integer id) {
		if (id <= listaContatos.size() - 1) {
			listaContatos.set(id, contato);
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
	 * @param ArrayList<Contatos> listaContatos
	 * @param Integer id
	 * @return String de sucesso
	 */
	public static String deletarContato(ArrayList<Contatos> listaContatos, Integer id) {
		if (id <= listaContatos.size() - 1) {
			listaContatos.remove(listaContatos.get(id));
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
	 * @param ArrayList<Contatos> listaContatos
	 * @param Contatos contato
	 * @return void
	 */
	public static void removerUmContatoPassandoUmContato(ArrayList<Contatos> listaContatos, Contatos contato) {
		listaContatos.remove(contato);
	}

	@Override
	public String toString() {
		return "Contatos [telefonePrincipal=" + telefonePrincipal + ", telefoneSecundario=" + telefoneSecundario
				+ ", email=" + email + "]";
	}

}
