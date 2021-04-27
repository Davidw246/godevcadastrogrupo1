package dao;

import java.util.ArrayList;

public class DaoFactory<T> implements DAO<T>{
	
	public ArrayList<T> itens = new ArrayList<T>();
	
	/**
	 * Cadastrar algo
	 * 
	 * Insere algo de determinado tipo no ArrayList de determinado tipo
	 * 
	 * @param item; de tipo flex�vel  
	 * @return true; cadastro realizado com sucesso
	 */
	public boolean cadastrar(T item) {
		itens.add(item);
		return true;
	}

	/**
	 * Retorna algo
	 * 
	 * Retorna algo de determiando tipo contido no ArrayList de determinado tipo
	 * 
	 * @param item; de tipo flex�vel  
	 * @return item; algo desejado existe 
	 * @return null; cadastro n�o existe
	 */
	public T listar(T item) {
		if (itens.contains(item)) {
			return (item);
		} else {
			return null;
		}
	}

	/**
	 * Retorna ArrayList
	 * 
	 * Retorna o ArrayList de determinado tipo	  
	 * 
	 * @return itens; ArrayList que cont�m todos os cadastros
	 */
	public ArrayList<T> listarTudo() {
		return itens;
	}

	/**
	 * Deleta algo
	 * 
	 * Tira algo de determinado tipo do ArrayList de determinado tipo
	 * 
	 * @param item; de tipo flex�vel  
	 * @return true; deleta��o realizada com sucesso
	 */
	public boolean delete(T item) {
		itens.remove(item);
		return true;
	}

	/**
	 * Atualiza algo
	 * 
	 * Troca algo de determinado tipo no ArrayList de determinado tipo por outro do mesmo tipo;
	 * 
	 * @param item; de tipo flex�vel  
	 * @param itemAntigo; de tipo flex�vel 
	 * @return true; atualiza��o realizada com sucesso
	 */
	public boolean atualizar(T item, T itemAntigo) {
		int indice = itens.indexOf(itemAntigo);
		itens.set(indice, item);
		return true;
	}

}
