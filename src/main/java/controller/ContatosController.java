package controller;

import java.util.ArrayList;

import model.Contatos;

public class ContatosController {


	
	/**
	 * Cadastrar contato
	 * 
	 * Realiza cadastro de contato no ArrayList<Contatos>
	 * 
	 * @param listaContatos
	 * @param contato
	 */
	public void cadastrarContato(ArrayList<Contatos> listaContatos, Contatos contato) {
		listaContatos.add(contato);
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
	public Contatos listarContato(ArrayList<Contatos> listaContatos, Integer id) {
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
	 * @param ContatosService contato
	 * @param Integer id
	 * @return Contatos contato
	 */
	public Contatos atualizarContato(ArrayList<Contatos> listaContatos, Contatos contato, Integer id) {
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
	public String deletarContato(ArrayList<Contatos> listaContatos, Integer id) {
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
	 * @param ContatosService contato
	 * @return void
	 */
	public void removerUmContatoPassandoUmContato(ArrayList<Contatos> listaContatos, Contatos contato) {
		listaContatos.remove(contato);
	}
	
}
